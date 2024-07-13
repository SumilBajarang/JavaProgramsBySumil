package questions;

import java.util.Arrays;

public class Q7 {
public static void main(String[] args) {
	int a=5;
	char s='4';
	System.out.println(String.valueOf(a));
	System.out.println(String.valueOf(s));
	char [] ch= {'a','a','a'};
	String cha=String.valueOf(ch);
	System.out.println(cha);//aaa
	System.out.println(Arrays.toString(ch));//[a, a, a]
	String num="8564";
	int n=Integer.valueOf(num);
	System.out.println(n);
	int n2=Integer.valueOf(s+"");
	System.out.println(n2);
	char d='d';
	String.valueOf(d);
	System.out.println(d);
}
}
