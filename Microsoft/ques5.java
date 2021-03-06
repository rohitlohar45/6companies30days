import java.util.*;
    
public class ques5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
            
        while(t-- > 0){
            int n =sc.nextInt();
            int a[] = new int[n];
                
            int i = 0;
            for(i = 0; i < n; i++)
                a[i] = sc.nextInt();
                  
            int[] s = new Solution().calculateSpan(a, n);
                
            for(i = 0; i < n; i++){
                System.out.print(s[i] + " ");
            }
                
            System.out.println();
        }
    }        
}
    
class Solution{
    public static int[] calculateSpan(int price[], int n){
            
        int [] result = new int[n];
        result[0] = 1;
        for (int i=1; i<n; i++) {
            result[i] = 1;
            for (int j = i-1; j>=0; j -= result[j]) {
                if (price[j] > price[i]) 
                    break;  
                result[i] += result[j];
            }
        }
        return result;     
    }
        
}
