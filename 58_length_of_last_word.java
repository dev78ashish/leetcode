class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String words[] = s.split("\\s+");
        int n = words.length;
        String z=words[n-1];
        return z.length();
    }
}
