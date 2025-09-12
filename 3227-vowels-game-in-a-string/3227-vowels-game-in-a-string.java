class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public boolean doesAliceWin(String s) {
        int vowelCount = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        return vowelCount > 0;
    }
}