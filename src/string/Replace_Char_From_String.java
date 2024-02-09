package string;

public class Replace_Char_From_String {

	public static void main(String[] args) {
		String s="java development"; 
		 String r1=s.replace('e','a'); 
		 System.out.println(r1); 
		 String r2=s.replaceAll("java","core java"); 
		 System.out.println(r2); 
		 String r3=s.replaceAll(" ",""); 
		 System.out.println(r3); 
		 String s1="jAvA DeVeloPer"; 
		 String r4=s1.replaceAll("[A-Z]",""); 
		 System.out.println(r4); 
		 String r5=s1.replaceAll("[a-z]",""); 
		 System.out.println(r5); 
		 String s2="ja123vaDEveloper";
		 String r6=s2.replaceAll("[0-9]",""); 
		 System.out.println(r6); 
		 String r7=s2.replaceAll("[aeiouAEIOU]",""); 
		 System.out.println(r7); 

	}

}

/**
1. WAP to replace e with a in given string "java development" 
2. WAp to replace "java" with "core java" in given "java development"
3. WAP to remove spaces from given string "java development" 
4. WAP to remove all capital letters from string "jAvA DeVeloPer" 
5. WAP to remove all small letters from same string 
6. WAP to remove digits from string "ja123vaDEveloper" 
7. WAP to remove vowels from string "ja123vaDEveloper" 



*/
