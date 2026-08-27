 class Leetcode2114 {
 public int MostWords(String [] scentence) {
    int max = 0;
    for (String s:scentence) {
        int wordCount = s.split(" ").length;
        max = Math.max(max, wordCount);
    }
    return max;
 }    
}
