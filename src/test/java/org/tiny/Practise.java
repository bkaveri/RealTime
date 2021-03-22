package org.tiny;

public class Practise {
	public static void main(String[] args) {
		int num=121;
		int rem=0;
		int res=0;
		
		
		while(num>0) {
			
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(num==res) {
		System.out.println("palin");
		}
		else {
			System.out.println("not palindromre");
		}
}
}