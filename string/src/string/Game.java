package string;

public class Game {

	public static void main(String[] args) {
		String s="abishek";
		int res=s.length();
		String rev="";
		for(int i=res-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		

	}

}
