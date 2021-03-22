package org.tiny;

public class Sample {
	public static void main(String[] args) {
		String s="welcome to java";
		String[] v = s.split(" ");
//		char[] m = s.toCharArray();
//		for(int i=0;i<m.length;i++) {
//			System.out.println(m[i]);
		String l = s.toLowerCase();
		System.out.println(l);
		
		String j = s.toUpperCase();
		System.out.println(j);
		
		char k = s.charAt(6);
		System.out.println(k);
		
		String u = s.substring(0,7);
		System.out.println(u);
		
		boolean b = s.isEmpty();
		System.out.println(b);
		
		boolean with = s.startsWith("we");
		System.out.println(with);
		
		boolean c = s.endsWith("va");
		System.out.println(c);
		
		
		
		
		}
	}


