class Solution {
    public char findTheDifference(String s, String t) {
        int xorResult = 0;

        // XOR all characters from both strings
        for (char c : s.toCharArray()) {
            xorResult ^= c;
        }
        for (char c : t.toCharArray()) {
            xorResult ^= c;
        }

        // The remaining XOR result is the extra character
        return (char) xorResult;
    }
}
