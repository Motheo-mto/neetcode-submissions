class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        int i=0;
        int j=0;
        
        while(i < word1.length() && j < word2.length())
        {
            char c = word1.charAt(i);
            newWord.append(c);
            i++;
            char k = word2.charAt(j);
            newWord.append(k);
            j++;
        }
        if(i < word1.length())
        {
            newWord.append(word1.substring(i));
        }
        else if(j < word2.length())
        {
            newWord.append(word2.substring(j));
        }
        return newWord.toString();
    }
}