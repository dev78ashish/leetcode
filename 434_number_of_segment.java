class Solution {
    public int countSegments(String s) {
        s=s.trim();
        String[] words = s.split("\\s+");
        if (s.isEmpty()) {
            return 0;
        }
        return words.length;
    }
}
