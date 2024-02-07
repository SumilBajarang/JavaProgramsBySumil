/**
 * . WAP to provide reverse of a string, actual string is "javadev"and reverse 
     string is "vedavaj" 
 */
package string;

public class Reverse_String {
public static void main(String[] args) {
	String s="jayadev";
	String s2="";
	for(int i=s.length()-1;i>=0;i--) {
		s2=s2+s.charAt(i);
	}
	System.out.println(s2);
}
}
