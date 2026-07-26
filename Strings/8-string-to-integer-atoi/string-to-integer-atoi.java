class Solution {
    String removeWhitespace(String s){
        return s.trim();
    }
    char signedfun(String s){
        char sign='+';
        if( s.length()>0 && s.charAt(0)=='-'){
            sign='-';
        }
        return sign;
    }
    long number(String s){
        int i=0;

         if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }

        long num=0;

        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            else{
               num = num*10 + (s.charAt(i)-'0');
                i++;
            }
        }
        return num;
    }
    public int myAtoi(String input) {
        // Your code goes here
        String ans=removeWhitespace(input);

        char signed=signedfun(ans);

        long  result=number(ans);
        
        if(signed=='-'){
            result=-result;
        }

    
        
        if(result>Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)  result;
    }
}
