package com.chunosov;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Task_1 ==========");

        String[] arrayStr = {"Старт", "Квадробер", "Панк", "Панк", "Рэп", "Реп", "Агломерация", "Реинкарнация",
                "Квадробер", "Реинкарнация", "Стул", "Саламандра","Панк", "Финал"};
        System.out.println("Список НЕ уникальных слов: " + Arrays.toString(arrayStr));

        Set<String> setStr = new HashSet<>(List.of(arrayStr));
        System.out.println("Список уникальных слов: " + setStr);

        Map<String, Integer> wordCounts = new HashMap<>();
        List<String> arrayListStr = new ArrayList<>(List.of(arrayStr));

        for (String elementStr : arrayListStr) {
            if (!wordCounts.containsKey(elementStr)) {
                wordCounts.put(elementStr, 1);
            } else {
                wordCounts.put(elementStr, wordCounts.get(elementStr) + 1);
            }
        }
        for (String key : wordCounts.keySet()) {
            System.out.println("Строка \"" + key + "\" встречается " + wordCounts.get(key) + " раз(а)");
        }
        System.out.println("========== Task_2 ==========");

        PhoneBookNumbers phoneBook = new PhoneBookNumbers();

        phoneBook.add("Иванов", "123456");
        phoneBook.add("Петров", "654321");
        phoneBook.add("Иванов", "111222");
        phoneBook.add("Сидоров", "333444");


        System.out.println("Номера Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номера Смирнова (нет записи): " + phoneBook.get("Смирнов"));
    }
}