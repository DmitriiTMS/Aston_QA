package com.chunosov;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создан метод printThreeWords:");
        printThreeWords();
        System.out.println("=====================");

        System.out.println("Создан метод checkSumSign:");
        checkSumSign();
        System.out.println("=====================");

        System.out.println("Создан метод printColor:");
        printColor();
        System.out.println("=====================");

        System.out.println("Создан метод compareNumbers:");
        compareNumbers();
        System.out.println("=====================");

        System.out.println("Создан метод sumTwoNumbers:");
        boolean resultMethod = sumTwoNumbers(2,8);
        System.out.println(resultMethod);
        System.out.println("=====================");

        System.out.println("Создан метод rationalNumber:");
        rationalNumber(0);
        System.out.println("=====================");

        System.out.println("Создан метод rationalNumberReturn:");
        System.out.println(rationalNumberReturn(56));
        System.out.println("=====================");

        System.out.println("Создан метод printLine:");
        printLine("qwe", 3);
        System.out.println("=====================");

        System.out.println("Создан метод getLeapYear:");
        System.out.println(getLeapYear(2024));
        System.out.println("=====================");

        System.out.println("Создан метод replaceNumbersInArray:");
        replaceNumbersInArray();
        System.out.println("=====================");

        System.out.println("Создан метод greateArrayWithOneHundredInt:");
        greateArrayWithOneHundredInt();
        System.out.println("=====================");

        System.out.println("Создан метод iterationArray:");
        iterationArray();
        System.out.println("=====================");



    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = -82;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumTwoNumbers(int number1, int number2) {
        int result = number1 + number2;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void rationalNumber(int number) {
        if (number < 0) {
            System.out.println("Число " + number + " отрицательное");
        } else {
            System.out.println("Число " + number + " положительное");
        }
    }

    public static boolean rationalNumberReturn(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printLine(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    public static boolean getLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void replaceNumbersInArray() {
        int[] arr = {1, 0, 0, 1, 0, 0};
        System.out.println("Массив до изменения: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println("Массив после изменения: " + Arrays.toString(arr));
    }

    public static void greateArrayWithOneHundredInt() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void iterationArray() {
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayNumbers.length; i++) {
            if(arrayNumbers[i] < 6) {
                arrayNumbers[i] = arrayNumbers[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }


}