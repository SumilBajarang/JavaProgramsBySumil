package array;

public class Find_Greates_Element_From_Array {

	public static void main(String[]args) {
		int[] a = { 20, 50, 10, 7, 100 };
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
