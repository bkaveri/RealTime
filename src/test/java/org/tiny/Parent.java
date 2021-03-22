package org.tiny;

public class Parent extends Inheritance{
public void gray() {
	System.out.println("wall");}
	public static void main(String[]args) {
		Parent p=new Parent();
		p.red();
	
		p.gray();
	}
}
