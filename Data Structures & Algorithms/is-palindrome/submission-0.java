class Solution {
    public boolean isPalindrome(String s) {
       if(s == null) {
        return false;
       }

       int left = 0;
       int right = s.length()-1;

       while(left<right){
        //move the left pointer to right side if it is not a valid character 
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }

        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
// Compare lowercase versions of the characters
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        left++;
        right--;
       }

       return true;
    }
}
