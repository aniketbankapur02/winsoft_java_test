//Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;
import java.util.Map;

class duplicate {
    public static void main(String[] args) {
        String str = "Hello sir how are you doing";
       
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == ' ')
                continue;
           
            if (map.containsKey(ch)) {
                
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters in the string are: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
          
            if (entry.getValue() > 1)
                System.out.println(entry.getKey());
        }
    }
}
