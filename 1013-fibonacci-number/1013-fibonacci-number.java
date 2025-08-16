class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int a=0,b=1;
        int c;
        for(int i=0;i<=n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b; //Final fibonacci number
    }
}