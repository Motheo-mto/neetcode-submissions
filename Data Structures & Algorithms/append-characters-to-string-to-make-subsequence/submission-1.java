class Solution {
    public int appendCharacters(String s, String t) {
        if (s.length() == 0) {
            return -1;
        }
        
        int i = 0; 
        int j = 0; 
        int n = s.length();
        int m = t.length();
        
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        
        return m - j;        
    }
}