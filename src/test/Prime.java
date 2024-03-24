package test;

public class Prime {

	public static void main(String[] args) {
		int num=23;// 1 ,15 
		int numerOfFactors=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				numerOfFactors++;//4
			}
		}
		if(numerOfFactors==2) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num is not prime");
		}
	}
}
