
//Reverse sentence without using split
package questions;

public class Q14 {
public static void main(String[] args) {
	String s="Welcome to Java";
	String givenString=reverseString(s)+' ';
	System.out.println(givenString);
	String fnl="";
	String word="";
	for(int i=0;i<givenString.length();i++) {
		if(!(givenString.charAt(i)==' ')) {
			word=word+givenString.charAt(i);
		}
		else if((givenString.charAt(i)==' ')) {
			fnl=fnl+reverseString(word)+ " ";
			word="";
			
		}
	}
	System.out.println(fnl);
	
}
public static String reverseString(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	
	return rev;
}
}
