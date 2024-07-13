//replace with index
package questions;

public class Q10 {
public static void main(String[] args) {
	String s="sumilbajarangparida";
	char replaceChar='a';
	int num=1;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch==replaceChar) {
			s=s.replaceFirst(String.valueOf(ch), String.valueOf(num));
			num++;
		}
	}
	System.out.println(s);
	
	
}
}
