package array;

import java.util.Scanner;

public class Take_Array_FromUser_Print_First_Last {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		 int size; 
		 System.out.println("Enter the size of an array:"); 
		 size=s.nextInt(); 
		 int a[]=new int[size]; 
		 for(int i=0;i<size;i++) 
		 { 
		 a[i]=s.nextInt(); 
		 } 
		 System.out.println(a[0]); 
		 System.out.println(a[a.length-1]); 
		 } 
	}
