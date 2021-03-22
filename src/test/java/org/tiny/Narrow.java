package org.tiny;

public class Narrow implements Value{
	public void jjam() {
		System.out.println("a");
	}

	public void justice() {
		System.out.println("b");
		// TODO Auto-generated method stub
		
	}

	public void bench() {
		System.out.println("c");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Narrow n=new Narrow();
		n.justice();
		n.bench();
		n.jjam();
	}

}
