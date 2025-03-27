package Q394_DecodeString;

class Solution {
    private int i = 0;

    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        while (i < s.length() && s.charAt(i) != ']') {
            if (!Character.isDigit(s.charAt(i))) {
                res.append(s.charAt(i++));
            }
            else {
                int k = 0;  // the multiplier for a substring
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    k = k * 10 + s.charAt(i++) - '0';
                }
                i++;
                String decodedString = decodeString(s);
                i++;
                while (k-- > 0)
                    res.append(decodedString);
            }
        }
        return res.toString();
    }
}