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



    }
}