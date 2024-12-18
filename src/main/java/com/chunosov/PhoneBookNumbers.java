package com.chunosov;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;




public class PhoneBookNumbers {

    private final Map<String, ArrayList<String>> phoneBook;

    public PhoneBookNumbers() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public ArrayList<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }
}
