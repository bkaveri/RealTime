package org.tiny;

public class Multiple {
	public static void main(String[] args) {
		int n=121;
		int res=0;
		int rem=0;
		
		while(n>0) {
			rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		if(n==res) {
		System.out.println("palin");
		
	}
		else {
			System.out.println("not palin");
		}
}
}