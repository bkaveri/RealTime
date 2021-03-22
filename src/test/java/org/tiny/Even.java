package org.tiny;

public class Even {
	public static void main(String[] args) {
		int n=100;
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				count++;
				System.out.println("even number is:"+i);
			}
		}
	}

}
