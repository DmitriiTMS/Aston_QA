package com.chunosov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создать метод printThreeWords:");
        printThreeWords();
        System.out.println("=====================");

        System.out.println("Создать метод checkSumSign:");
        checkSumSign();
        System.out.println("=====================");

        System.out.println("Создать метод printColor:");
        printColor();
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

}