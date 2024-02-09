package string;

public class Frequency_Of_SubString_In_The_String {

	public static void main(String[] args) { 
		 String str1="we work to live and live to be happy live"; 
		 String word1="live"; 
		 check(str1,word1); 
		 } 
		public static void check(String str, String word) { 
		 String s[]=str.split(" "); 
		 int count=0; 
		 for(int i=0;i<s.length;i++) 
		 { 
		 if(word.equals(s[i])) 
		 { 
		 count++; 
		 }} 
		 System.out.println(count);

    }
}
