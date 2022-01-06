import java.util.*;

class goldmanprblm_5{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            long res = Solution.getNthUglyNo(n);
            
            System.out.println(res);
        }

    }

}

class Solution {
    public static long getNthUglyNo(int n) {
       long dp[]=new long[n+1];
       dp[1]=1;
       int ptr1=1;
       int ptr2=1;
       int ptr3=1;
       for(int i=2;i<=n;i++)
       {
           long val1=dp[ptr1]*2;
           long val2=dp[ptr2]*3;
           long val3=dp[ptr3]*5;
           long min=Math.min(val1,Math.min(val2,val3));
           dp[i]=min;
           if(min==val1)
           ptr1++;
           if(min==val2)
           ptr2++;
           if(min==val3)
           ptr3++;
       }
       return dp[n];
   }
}