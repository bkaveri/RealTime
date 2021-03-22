package org.tiny;

public class Ceremony {
	public void main(String[] args) {
		int n=12345;
		int res=0;
		int rem=0;
		
		while(n>0) {
			rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
System.out.println("rev of num"+res);
}
}