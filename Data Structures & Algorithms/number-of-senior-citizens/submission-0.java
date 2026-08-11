class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++)
        {
            String ageChar1 = String.valueOf(details[i].charAt(11));
            String ageChar2 = String.valueOf(details[i].charAt(12));
            int age = Integer.parseInt(ageChar1 + ageChar2);
            if(age > 60)
            {
                count++;
            }
        }
        return count;
    }
}