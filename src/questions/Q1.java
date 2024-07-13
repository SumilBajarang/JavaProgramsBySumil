
//print duplicate character only once
package questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q1 {

	public static void main(String[] args) {
		String s="sumilbajarangparida";
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				char ch=s.charAt(j);
				if(!(i==j)&&s.charAt(i)==s.charAt(j)) {	
					set.add(ch);
				}
			}
		}
		System.out.println(set);
	}
}
