package Q443_StringCompression;

class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;   // i: read pointer, j: write pointer
        while (i < chars.length) {
            int groupLen = 1;
            while (i + groupLen < chars.length && chars[i] == chars[i + groupLen]) {
                groupLen++;
            }
            chars[j++] = chars[i];
            if (groupLen > 1) {
                for (char c : Integer.toString(groupLen).toCharArray()) {
                    chars[j++] = c;
                }
            }
            i += groupLen;
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // expect 6
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(solution.compress(chars));
    }
}
