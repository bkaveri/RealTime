package org.tiny;

import java.util.LinkedHashSet;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		Set<Integer>l=new LinkedHashSet();

		l.add(12);
		l.add(13);
	l.add(12);
	l.add(10);
	l.add(10);
	l.add(18);
	l.add(12);
	System.out.println(l);
	
	int s = l.size();
	System.out.println(s);
		
	}

}
