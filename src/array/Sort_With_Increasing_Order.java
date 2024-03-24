package array;

import java.util.Arrays;

public class Sort_With_Increasing_Order {

	public static void main(String[]args) {
		int[] a = { 20, 50, 10, 7, 100 };
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			}
		
		System.out.println(Arrays.toString(a));
	}
	
}
