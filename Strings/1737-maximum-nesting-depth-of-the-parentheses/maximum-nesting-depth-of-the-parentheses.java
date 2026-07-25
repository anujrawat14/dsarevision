class Solution {
    public int maxDepth(String s) {

        int maxCounter = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                counter++;
            } else if (ch == ')') {
                maxCounter = Math.max(counter, maxCounter);
                counter--;
            }
        }
        if(counter!=0){
            return -1;
        }
        else{
            return maxCounter;
        }
    }
}