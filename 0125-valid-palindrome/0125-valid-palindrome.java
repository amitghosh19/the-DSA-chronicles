class Solution {
    public boolean isPalindrome(String s) {
        String s_lower = s.toLowerCase();
        int i=0;
        int j= s_lower.length()-1;

        while(i<j){
            if(!Character.isLetterOrDigit(s_lower.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s_lower.charAt(j))){
                j--;
                continue;
            }

            if(s_lower.charAt(i)!=s_lower.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}