
//Reverse each word in string
package questions;

public class Q6 {
public static void main(String[] args) {
	String s="sumil bajarang parida";
	String [] s1=s.split(" ");
	for(String word:s1) {		
		System.out.println(reverseString(word));
	}
}
private static String reverseString(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	return rev;

}
}
