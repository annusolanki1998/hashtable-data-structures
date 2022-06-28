package com.bridgelabz;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable Program ");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String input ="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] inputArray = input.toLowerCase().split(" ");
        for (String str : inputArray) {
            if (hashtable.containsKey(str)) {
                hashtable.put(str, hashtable.get(str) + 1);
            } else {
                hashtable.put(str, 1);
            }
        }
        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}