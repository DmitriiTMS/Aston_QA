package com.chunosov;

public class Main {
    public static void main(String[] args) throws MyArrayDataException {

        String[][] arrayMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "python", "15", "16"},
        };

        try {
            exceptionsInArray(arrayMatrix);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static void exceptionsInArray(String[][] arrayStr) throws MyArraySizeException, MyArrayDataException {
        boolean lengthParentArray = arrayStr.length == 4;
        boolean isArrayFourElements = true;

        for (String[] childArr : arrayStr) {
            if (childArr.length != 4) {
                isArrayFourElements = false;
            }
        }

        if (!lengthParentArray || !isArrayFourElements) {
            throw new MyArraySizeException("Матрица не размером 4х4");
        }



        int summaElementsMatrix = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 0; j < arrayStr[i].length; j++) {
                try {
                    int elem = Integer.parseInt(arrayStr[i][j]);
                    summaElementsMatrix += elem;
                } catch (NumberFormatException error) {
                    throw new MyArrayDataException(
                            "Ошибка: \n" +
                            "1) Массив под индексом: " + i + "\n" +
                            "2) Элемент массива под индексом: " + j + "\n" +
                            "3) Наименование элемента в массиве: " + arrayStr[i][j],
                            error
                    );
                }
            }
        }
        System.out.println("Сумма все чисел в матрице равна: " + summaElementsMatrix);
    }
}