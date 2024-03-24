package test;

public class ReverseNumber {
	static String a;
	public static void main(String[] args) {	
		int num=4567;//67 ,6 ,0 , answer=276
		int rev=0;
		while(num!=0) {
			int mod=num%10;//6
			rev=rev*10+mod;//276
			num=num/10;	//0		
		}
		System.out.println(rev);
	}
}
