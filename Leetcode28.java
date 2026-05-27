class Leetcode28 {

    public int strStr(String haystack, String needle) {

        // Loop through haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            // Check if substring matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return starting index if found
            }
        }

        return -1; // Return -1 if needle is not found
    }
}
