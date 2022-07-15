package string;

public class reverse {
// using 
	public static void main(String[] args) {
    String s="HELLO";
    int res=s.length();
    String rev="";
    for(int i=res-1;i>=0;i--)
    {
    	rev=rev+s.charAt(i);
    	
    }
	System.out.println(rev);
	
	
	
	
	
}}
