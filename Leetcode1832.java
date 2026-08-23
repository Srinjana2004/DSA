public class Leetcode1832 {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
// public class Leetcode1832 {
//   public boolean checkIfPangram(String sentence) {
//   return scentence.chars().distinct().count()==26;
//   }
// }
