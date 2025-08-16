class Solution {
    public boolean isPalindrome(int x) {
          int rem ,rev=0;
        int m = x;
        while(x>0){
            rem = x%10;
            x= x/10;
            rev = rev * 10 + rem;
        }
        if(m==rev){
            return true;
        }else{
            return false;
        }
    }
}