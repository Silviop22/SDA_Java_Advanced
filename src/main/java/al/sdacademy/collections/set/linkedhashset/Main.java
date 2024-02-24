package al.sdacademy.collections.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    
    /* Given a string s, find the first non-repeating character in it
    and return its index. If it does not exist, return -1.
     */
    public static void main(String[] args) {
        String s = "aaaaac";
        System.out.println(firstUniqChar(s));
        System.out.println(findFirstUniqueCharacter(s));
    }
    
    public static int firstUniqChar(String s) {
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    
    static int findFirstUniqueCharacter(String inputString) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        HashSet<Character> repeatingChars = new HashSet<>();
        
        for (char character : inputString.toCharArray()) {
            getFirstUniqueCharacter(uniqueChars, repeatingChars, character);
        }
        
        return uniqueChars.isEmpty() ? -1 : inputString.indexOf(uniqueChars.iterator().next());
    }
    
    private static void getFirstUniqueCharacter(LinkedHashSet<Character> uniqueChars, HashSet<Character> repeatingChars, char character) {
        if (!repeatingChars.contains(character)) {
            if (uniqueChars.contains(character)) {
                uniqueChars.remove(character);
                repeatingChars.add(character);
            } else {
                uniqueChars.add(character);
            }
        }
    }
}