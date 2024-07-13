
//Print duplicate elements from a a String
package questions;

public class Q2 {
public static void main(String[] args) {
	String s="abcdeabtk";
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s.length();j++) {
			if(!(i==j)&&s.charAt(i)==s.charAt(j)) {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	
}
}

/* 
i
a
r

*/
