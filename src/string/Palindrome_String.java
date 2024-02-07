package string;

public class Palindrome_String {
public static void main(String[] args) {
	String actual="madam"; 
	 String rev=""; 
	 for(int i=actual.length()-1;i>=0;i--) 
	 { 
	 rev=rev+actual.charAt(i); 
	 } 
	 System.out.println("Actual String : "+actual); 
	 System.out.println("Reverse String : "+rev); 
	 if(actual.equals(rev)) 
	 { 
	 System.out.println("Given String is pallindrome"); 
	 }
}
}
