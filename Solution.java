public class Solution {

	public static char highestOccuringChar(String str) {
        int count = 0, idx = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int charCount = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    charCount++;
                }
            }
            
            if (charCount > count) {
                count = charCount;
                idx = i;
            }
        }
        return str.charAt(idx);
    }
