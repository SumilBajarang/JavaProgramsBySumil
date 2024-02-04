
/**
 * WAP to check count of e/E character present in a String s="javaEEdeve"
 */

package string;

public class Count_Specific_Character_In_String {
	public static void main(String[] args) {
		count();
	}
	
	public static void count() {
		int count=0;
		String s="javaEEdeve";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				count++;
			}
		}
		System.out.println(count);
	}
}

