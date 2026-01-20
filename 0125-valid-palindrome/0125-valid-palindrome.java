class Solution {

    private boolean isalphanumeric(char c){
        if(c>='a' && c<='z') return true;
        if(c>='A' && c<='Z') return true;
        if(c>='0' && c<='9') return true;
        return false;
    }
    private char tolowercase(char c){
        if(c>='A' && c<='Z'){
            return (char)(c+32);
        }
        return c;
    }
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isalphanumeric(s.charAt(left))){
                left++;
            }
            while(left<right && !isalphanumeric(s.charAt(right))){
                right--;
            }

            if(tolowercase(s.charAt(left)) !=tolowercase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}