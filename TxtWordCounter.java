/* 
 * Andrew Mugera Muriithi
 */
package org.howard.edu.lsp.assignment2;  // Specify the package name

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TxtWordCounter {
    public static void main(String[] args) throws IOException {
        String fileName = "word.txt";
        
        // Read file content into a single string
        String content = new String(Files.readAllBytes(Paths.get(fileName)));

        content = content.toLowerCase(); //Convert all text to lower case 
        
        String[] words = content.split("[^a-zA-Z']+"); // split content into words
        
        Map<String, Integer> wordCount = new HashMap<>(); // Map used to store word counts
        
        // Word Processing
        for (String word : words) {
            //Trivial Words
            if (word.isEmpty() || word.length() <= 3 || isNumeric(word)) {
                continue;
            }
            
            // Update word count
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Display the word counts
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Checks if the string is numeric
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");  // Check if the string contains only digits
    }
}