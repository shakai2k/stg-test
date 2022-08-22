package com.stg.business;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String input = "aabcdeb";
        int count = calculateRepeatedCount(input);
        System.out.println(count);
    }
    
    private static int calculateRepeatedCount(String input) {
        input = input.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(map.get(input.charAt(i)) == null){
                map.put(input.charAt(i), 1);
            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1)
                count = count+1;
        }
        return count;
    }
    
}
