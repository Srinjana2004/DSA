class Leetcode242 {
    public boolean isAnagram(String s, String t) {

        // Create an array of size 26 to store frequency of letters a-z
        int[] freq = new int[26];

        // Loop through each character of string s
        for (char c : s.toCharArray()) {
            // Increase count of that character
            freq[c - 'a']++;
        }

        // Loop through each character of string t
        for (char c : t.toCharArray()) {
            // Decrease count of that character
            freq[c - 'a']--;
        }

        // Check all frequencies
        for (int f : freq) {
            // If any count is not 0, strings are not anagrams
            if (f != 0) {
                return false;
            }
        }

        // If all counts are 0, strings are anagrams
        return true;
    }
}