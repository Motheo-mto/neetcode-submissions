class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String lastword = s.substring(s.lastIndexOf(" ")+1);
        return lastword.length();
    }
}