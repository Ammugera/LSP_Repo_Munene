package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilitesDriver {
    public static void main(String[] args) {
        // Create the first HashMap and add key-value pairs to it
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("name", "Alice");
        map1.put("city", "New York");
        map1.put("age", "25");

        // Create the second HashMap and add key-value pairs to it
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("name", "Alice");
        map2.put("city", "Los Angeles");
        map2.put("age", "25");

        // Output the number of common key-value pairs
        System.out.println("Number of common key/value pairs is: " +
                MapUtilities.commonKeyValuePairs(map1, map2));
    }
}