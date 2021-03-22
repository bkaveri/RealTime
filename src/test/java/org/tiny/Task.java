package org.tiny;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task {
public static void main(String[] args) {
	ArrayList<Integer>p=new ArrayList();
	p.add(11);
	p.add(22);
	p.add(33);
	p.add(11);
	p.add(55);
	p.add(77);
	p.add(11);
	System.out.println(p);
	
	Set<Integer>li=new HashSet<Integer>();
	
//for(int i=0;i<li.size();i++) {
//		System.out.println(p.get(i));
	li.addAll(p);
	for(int x:li) {
		System.out.println(x);
	}
}
}



