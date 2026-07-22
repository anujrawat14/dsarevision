class Solution {
    public String reverseWords(String s) {
        StringBuffer ans= new StringBuffer();
        String[] words = s.trim().split("\\s+"); // trim remove starting and ending space //split use to divide  words into tokens and \\s+ used when multiple space is present between them

        for(int i=words.length-1;i>=0;i--){
            ans.append(words[i]);
            if(i!=0){
                 ans.append(" ");
            }
        }

        return ans.toString();
    }
}
