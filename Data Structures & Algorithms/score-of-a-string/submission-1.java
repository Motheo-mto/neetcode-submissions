class Solution {
    public int scoreOfString(String s) {
        int ans[] = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ans[i] = (int) s.charAt(i);
        }
        int temp = 0;
        for(int i=0;i<ans.length-1;i++)
        {
            for(int j=i+1;j<=i+1;j++)
            {
                int diff = ans[j] - ans[i];
                temp += Math.abs(diff);
            }
        }
        return temp;
    }
}