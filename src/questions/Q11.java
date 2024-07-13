package questions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q11 {
public static void main(String[] args) {
	List<Integer> lis1=new ArrayList();	
	lis1 .add(1);
	lis1 .add(2);
	lis1 .add(3);
	lis1 .add(4);
	lis1 .add(5);
	List<Integer> list2=new ArrayList();
	list2 .add(2);
	list2 .add(3);
	Set<Integer> set=new LinkedHashSet(lis1);
	set.retainAll(list2);
	System.out.println(set);
}
}
