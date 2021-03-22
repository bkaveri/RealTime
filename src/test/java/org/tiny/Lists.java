package org.tiny;

import java.util.ArrayList;
import java.util.List;

public class Lists {
public static void main(String[] args) {
	List <Integer>li=new ArrayList();
	
	li.add(12);
	li.add(20);
	li.add(11);
	li.add(30);
	li.add(11);
	li.add(40);
	System.out.println(li);
	
//	Integer k = li.get(2);
//	System.out.println(k);
//	
//	
//	boolean c = li.contains(11);
//	System.out.println(c);
//	Integer v = li.set(2, 99);
//	System.out.println(v);
//	
//	li.add(4, 88);
//	System.out.println(li);
	List<Integer>u=new ArrayList();
	u.addAll(li);
	u.add(50);
	u.add(100);
	u.add(150);
	u.add(200);
	u.add(500);
	System.out.println(u);
	//for(int i=0;i<u.size();i++) {
	//System.out.println(u.get(x));

	for(Integer x:u) {
		System.out.println("diff:"+x);
	}
	
	
}
}
