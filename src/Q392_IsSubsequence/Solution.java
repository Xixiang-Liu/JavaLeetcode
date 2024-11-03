package Q392_IsSubsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int pS = 0, pT = 0;
        while (pS < s.length() && pT < t.length()) {
            if (s.charAt(pS) == t.charAt(pT)) {
                pS++;
            }
            pT++;
        }
        return pS == s.length();
    }
}
