package questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q3 {
	public static void main(String[] args) {
		String s="SumilBajarangParida";
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);			
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int value=map.get(ch);
				map.put(ch, value+1);
			}
			
		}
		System.out.println(map);
	}
}

