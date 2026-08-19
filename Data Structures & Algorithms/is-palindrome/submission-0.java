class Solution {
    public boolean isPalindrome(String s) {
        String curr = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for(int i = 0; i<curr.length();i++)
        {
            char c = curr.charAt(i);
            first.append(c);
        }
        String newFirst = first.toString();
        for(int i = curr.length()-1;i>=0;i--)
        {
            char c = curr.charAt(i);
            second.append(c);
        }
        String newSecond = second.toString();
        if(newFirst.equals(newSecond))
        {
            return true;
        }
        return false;
    }
}
