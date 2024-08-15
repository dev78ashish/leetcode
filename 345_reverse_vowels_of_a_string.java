class Solution {
    public String reverseVowels(String s) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (isVowel(ch[start]) && isVowel(ch[end])) {
                char c = ch[start];
                ch[start] = ch[end];
                ch[end] = c;

                start++;
                end--;
            } else if (isVowel(ch[start])) {
                end--;
            } else {
                start++;
            }
        }
        return new String(ch);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
