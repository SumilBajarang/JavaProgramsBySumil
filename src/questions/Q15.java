package questions;

public class Q15 {

	public static void main(String[] args) {
		String given="welcome to java";
		given=given+" ";
		String word="";
		String finalAnswer="";
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)!=' ') {
				word=word+given.charAt(i);
			}
			else {
				finalAnswer=finalAnswer+ reverseString(word)+ " ";
				word="";
			}
		}
		System.out.println(finalAnswer);
	}
	
	public static String reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		return rev;
	}

}
