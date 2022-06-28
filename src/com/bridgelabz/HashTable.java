package com.bridgelabz;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to hash table program !");

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String input = "To be or not to be";
        String[] inputArray = input.toLowerCase().split(" ");
        for (String string : inputArray) {
            if (hashtable.containsKey(string)) {
                hashtable.put(string, hashtable.get(string) + 1);
            } else {
                hashtable.put(string, 1);
            }
        }
        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}


