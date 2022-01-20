import java.util.*;

public class ques15 {
    public static String RecentString(String s1, String s2) {
		int n=s1.length(); 
        int m=s2.length();
		
		int i=0;
		
		if(s1==null || s2==null) return null;
		else if(s1 == s2) return null;
		
		while(i < ((n<m)?n:m)) {
			if(s1.charAt(i) < s2.charAt(i)) {
				return s1;
			}
			else if(s1.charAt(i) > s2.charAt(i)) {
				return s2;
			}
			else i++;
		}
		
		return (n<m)? s1:s2;
		
	}
	
	
	public static void main(String[] args) {
        String s1="10";
        String s2="10.1";
        String res = RecentString(s1,s2);
        System.out.println(res);
	}
}
