class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(x>0)
        {
            int n1=x%10;
            rev=rev*10+n1;
            x=x/10;
        }
        if(rev==n)
        return true;
        else 
        return false;
    }
}