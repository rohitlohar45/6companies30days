import java.io.*;
import java.util.*;

public class ques8{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.height(N));
        }
    }
}

class Solution{
    static int height(int N){
        return (-1 + (int)Math.sqrt(1 + 8*N)) / 2;
    }
}