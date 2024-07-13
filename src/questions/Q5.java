//Anagrams
package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		String [] givenList= {"sumil","umils","ball","fan","allb"};
		for(int i=0;i<givenList.length;i++) {
			for(int j=0;j<givenList.length;j++) {
				String s1=m1(givenList[i]);
				String s2=m1(givenList[j]);
				if(!(i==j)&&s1.equals(s2)) {
					ArrayList list=new ArrayList();
					list.add(givenList[i]);
					list.add(givenList[j]);
					System.out.println(list);
					list.clear();
				}
			}
		}
	}

	private static String m1(String s) {
		char [] ch1=s.toCharArray();
		Arrays.sort(ch1);
		return Arrays.toString(ch1);
		}
}
