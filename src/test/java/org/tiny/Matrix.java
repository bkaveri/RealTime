package org.tiny;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Matrix {
	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap();
		
		m.put(111, "sai");
		m.put(222, "ram");
		m.put(343, "kilo");
		m.put(676, "opt");
		
		System.out.println(m);
		
		Set<Integer>key=m.keySet();
		System.out.println(key);
		
		Collection<String>val=m.values();
		System.out.println(val);
		
		String t = m.get(111);
		System.out.println(t);
		
		
		
		
		Set<Entry<Integer,String>>en=m.entrySet();
		for(Entry<Integer,String>x:en) {
			System.out.println(x);
		}
	}

}
