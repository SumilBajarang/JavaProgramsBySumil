package array;

public class Second_Highest_Value_From_Array {
	public static void main(String[] args) {
		int [] a= {4,5,6,7,18,9,30};
		int max=a[0];
		int secondMax=a[0];
		for (int i=0; i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];	
			}
			
		}
		System.out.println(secondMax);
		System.out.println(max);
	}
}
