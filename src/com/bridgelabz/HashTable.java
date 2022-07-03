package com.bridgelabz;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable Program ");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String input = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        input = input.replace("avoidable","");     // removing avoidable word replace with space
        String[] inputArray = input.toLowerCase().split(" ");  // It is converting to lowercase and also split it like every word
        for (String str : inputArray) {
            if (hashtable.containsKey(str)) {    // checking every word
                hashtable.put(str, hashtable.get(str) + 1);  // more than one time incremented by 1.
            } else {
                hashtable.put(str, 1); // only one time word in --> input
            }
        }
        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());// print the all frequency with value and string
        }
    }
}