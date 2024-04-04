//Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;

class wordcount {
    public static void main(String[] args) {
     
        String str = "hello sir how are you ";

       
        String[] strArray = str.split("\\s+");

       
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : strArray) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        
        System.out.println("Count of the words is: " + wordCountMap.size());
    }
}
