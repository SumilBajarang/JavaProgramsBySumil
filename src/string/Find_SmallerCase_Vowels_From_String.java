/*
 * WAP to find smaller case vowels fom string s="javadev"
     a.print vowels b.count vowels
 */

package string;

public class Find_SmallerCase_Vowels_From_String {

	public static void main(String[] args) {
		String s="javadev";
		printAndCountVowels(s);

	}
	public static void printAndCountVowels(String s) {
		int count=0;
		for(char c:s.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println(c);
				count++;
			}
		}
		System.out.println("number of vowels is : "+count);
	}

}
