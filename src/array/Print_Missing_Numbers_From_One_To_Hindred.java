package array;

public class Print_Missing_Numbers_From_One_To_Hindred {
	public static void main(String[] args) {
		int a[]= {22,17,4,66,8,2,87}; 
		for(int i=1;i<=100;i++) {
				if(!verifyArrayContainsValue(i)) {
					System.out.println(i);
				}
			}
		}
	
public static boolean verifyArrayContainsValue(int k) {
	int a[]= {22,17,4,66,8,2,87};
	boolean vaue=false;
	for(int i=0;i<a.length;i++) {
		if(a[i]==k) {
			vaue= true;
			break;
		}
		else {
			vaue= false;
		}
	}
	return vaue;
}
}
