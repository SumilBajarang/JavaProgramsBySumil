//print each character once
package questions;

public class Q4 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String s = "sumilbajarangparida";
		String uniqueString="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(uniqueString.indexOf(ch)==-1) {
				uniqueString=uniqueString+ch;
			}
		}
		System.out.println(uniqueString);
	}
}
