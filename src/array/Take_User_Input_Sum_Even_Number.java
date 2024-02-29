package array;

import java.util.Scanner;

public class Take_User_Input_Sum_Even_Number {
	static int sum=0;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int [] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=scn.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(array[i]%2==0) {
				sum=sum+array[i];
			}
		}
		System.out.println(sum);
	}

}
