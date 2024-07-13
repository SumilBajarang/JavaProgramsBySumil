package array;

import java.util.Scanner;

public class Sum_Average_Of_Array {

	public static void main(String[] args) {
		  int [] a={6,3,8,12,9};
          int sum=0;
          for(int i=0;i<a.length;i++){
              sum=sum+a[i];
          }
          float avg=(float)sum/a.length;
          System.out.println(avg);
	}

}
//done=2