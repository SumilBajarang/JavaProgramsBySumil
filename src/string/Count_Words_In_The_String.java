package string;

public class Count_Words_In_The_String {

	public static void main(String[] args) {
		String s=" I am a java developer "; 
		 System.out.println("Before trimming:"+s); 
		 String s1=s.trim();//helps to remove spaces from start and end 
		 //of sentence
		 System.out.println("After trimming:"+s1); 
		 int count=1; 
		 for(int i=0;i<s1.length();i++) { 
		 if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') { 
		 count=count+1; 
		 }} 
		 System.out.println("No of words are : "+count); 

	}

}
