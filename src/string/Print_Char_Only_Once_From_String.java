package string;

public class Print_Char_Only_Once_From_String {

	public static void main(String[] args) {
			String s="javajavajavadevdev"; 
			String un=""; 
			for(int i=0;i<s.length();i++) { 
			char ch=s.charAt(i); 
			if(un.indexOf(ch)==-1) { 
			un=un+ch; 
			}} 
			System.out.println("Unique string is :"+un); 

	}

}
/**
  Note:-
  un.indexOf(ch) - here if character is not present ,it will give  -1
  
 
 
 */
