package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class QQ13 {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap();
	map.put(1, "b");
	map.put(5, "e");
	map.put(9, "d");
	map.put(12, "c");
	map.put(7, "a");
	
	Set<Entry<Integer,String>> s=map.entrySet();
	List<Entry<Integer,String>> al=new ArrayList(s);
	Collections.sort(al,new Comparator<Entry<Integer,String>>(){
		public int compare(Entry<Integer,String> e1,Entry<Integer,String> e2) {
			return e2.getValue().compareTo(e1.getValue());
		}
	});
	TreeMap t=new TreeMap(map);
	System.out.println(t);
	
}
}
