import java.io.*;
import java.util.*;
public class ques1
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
} 

class Solution
{

	public int minDifference(int arr[], int n) { 
	    int sum = 0;
        for(int ele: arr) sum += ele;
    
        boolean[][] dp = new boolean[n+1][sum+1];
    
        for(int i=0; i<=n; i++) {
            dp[i][0] = true;
        }
    
        for(int i=1; i<=sum; i++) {
            dp[0][i] = false;
        }
    
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sum; j++) {
                dp[i][j] = dp[i-1][j];
                if(arr[i-1]<=j) {
                    dp[i][j] = dp[i][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
    
        int mindiff = Integer.MAX_VALUE;
        for(int j=sum/2; j>=0; j--) {
            if(dp[n][j]) {
                mindiff = sum-2*j;
                break;
            }
        }
    
        return mindiff;
	} 
}

