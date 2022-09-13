package level1;

import java.util.HashMap;

public class LongestPalindrome409 {

    public int longestPalindromeSolution1(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int lengthOfLongest = 0;
        boolean singleChar = false;

        for (char c: s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c: charCount.keySet()) {
            if (charCount.get(c) % 2 == 0) {
                lengthOfLongest += charCount.get(c);
            } else {
                lengthOfLongest += charCount.get(c) - 1;
                singleChar = true;
            }
        }

        if (singleChar) {
            lengthOfLongest++;
        }

        return lengthOfLongest;
    }

    public int longestPalindromeSolution2(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int lengthOfLongest = 0;

        for (char c: s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c: charCount.keySet()) {
            lengthOfLongest += (charCount.get(c) / 2) * 2;
        }

        if (lengthOfLongest < s.length()) {
            lengthOfLongest++;
        }

        return lengthOfLongest;
    }
}
