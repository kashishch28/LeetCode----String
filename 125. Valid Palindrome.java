class Solution {
    public boolean isPalindrome(String s) {
        String clear = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left=0;
        int right = clear.length()-1;
        while(left<right){
            if(clear.charAt(left)!=clear.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
