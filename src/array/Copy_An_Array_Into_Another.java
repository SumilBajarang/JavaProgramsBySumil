package array;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_An_Array_Into_Another {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in); 
		 int size; 
		 System.out.println("Enter the size of an array:"); 
		 size=s.nextInt(); 
		 int a[]=new int[size]; 
		 for(int i=0;i<a.length;i++) 
		 { 
		 a[i]=s.nextInt(); 
		 } 
		 int [] b=new int[a.length];
		 for(int i=0;i<b.length;i++) {
			 b[i]=a[i];
		 }
		 System.out.println("Array Copied is :"+Arrays.toString(b));
	}

}
