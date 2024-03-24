package string;

public class Count_Longest_Word_From_String {
	public static void main(String[] args) {
		String s = "I am a java developer";
		String [] wordsArray=s.split(" ");
		String longestWord=null;
		int max=0;
		for(int i=0;i<wordsArray.length;i++) {
			System.out.println(wordsArray[i]+" "+wordsArray[i].length());
			if(wordsArray[i].length()>max){
				max=wordsArray[i].length();
				longestWord=wordsArray[i];
			}
		}
		System.out.println("Longest word "+longestWord+" "+max);

	}
}
