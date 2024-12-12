package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;
import java.util.Map;


public class MapUtilities {

    /**
     * Returns the number of common key-value pairs between two HashMaps.
     * If either or both maps are empty the method instead returns 0.
     *
     * @param map1 the first HashMap with String keys and values
     * @param map2 the second HashMap with String keys and values
     * @return the number of common key-value pairs, or 0 if either map is empty
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is null or empty
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate over first map entries
        for (Map.Entry<String, String> entry : map1.entrySet()) {

            if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
                commonCount++;
            }
        }

        return commonCount;
    }
}