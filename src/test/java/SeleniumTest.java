import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.*;


public class SeleniumTest {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll()
    public static void openWebTest() {
        driver = new ChromeDriver();

        driver.get("https://www.mts.by");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

    }

    @Test
    @DisplayName("Проверка наличия заголовка блока \"Онлайн пополнение без комиссии \"")
    @Order(1)
    public void getNameBlockTest() {
        WebElement titleBlock = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String resultStr = titleBlock.getText().replaceAll("[^a-zA-Zа-яА-Я\\s]", "")
                                                .replaceAll("\\s+", " ");
        String expectedTitle = "Онлайн пополнение без комиссии";
        assertEquals(expectedTitle, resultStr, "Заголовок с наименованием \"Онлайн пополнение без комиссии \" не найден" );
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    @Order(2)
    public void isImgListTest() {
        List<WebElement> images = driver.findElements(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li/img"));
        assertFalse(images.isEmpty(), "На странице нет изображений!");
        for (WebElement img : images) {
            String src = img.getDomAttribute("src");
            assertTrue(src != null && !src.isEmpty(), "Изображение без атрибута src найдено!");
        }
    }

    @Test
    @DisplayName("Проверка работоспособности ссылки \"Подробнее о сервисе\" ")
    @Order(3)
    public void isLinkPageTest() {

        WebElement buttonCookies = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        buttonCookies.click();

        driver.manage().deleteAllCookies();

        WebElement link = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        link.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl,"URL не соответствует ожидаемому!");
    }
//
//    @Test
//    @DisplayName("Проверка заполнения формы и работы кнопки «Продолжить»")
//    @Order(4)
//    void onlinePaymentFormTest() {
//
//        WebElement buttonCookies = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
//        buttonCookies.click();
//
//        WebElement onlinePaymentBlock = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]"));
//        assertNotNull(onlinePaymentBlock, "Блок «Онлайн пополнение без комиссии» не найден");
//
//        WebElement serviceOption = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
//        serviceOption.click();
//
//        WebElement serviceOptionLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]"));
//        serviceOptionLink.click();
//
//        WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
//        String testPhoneNumber = "297777777";
//        phoneNumberField.sendKeys(testPhoneNumber);
//
//        WebElement amountField = driver.findElement(By.id("connection-sum"));
//        String testAmount = "10";
//        amountField.sendKeys(testAmount);
//
//        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
//        continueButton.click();
//
//    }



    @AfterAll()
    public static void closeWebTest() {
        driver.quit();
    }

}
