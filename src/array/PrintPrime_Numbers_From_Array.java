package array;

public class PrintPrime_Numbers_From_Array {

	public static void main(String[] args) {
		int a[]={13,4,56,32,99,11} ;
		for(int i=0;i<a.length;i++) {
			if(verifyPrime(a[i])) {
				System.out.println(a[i]);
			}
		}		
	}
	public static boolean verifyPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==2) 
			return true;
		else
			return false;
		
	}

}
