//First duplicate character
package questions;

public class Q8 {
public static void main(String[] args) {
	String s="sumilbajarangparida";
	for(int i=0;i<s.charAt(i);i++) {
		boolean flag=false;
		for(int j=0;j<s.length();j++) {
			if(!(i==j)&&s.charAt(i)==s.charAt(j)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(s.charAt(i));
			break;
		}
		
	}
}
}
