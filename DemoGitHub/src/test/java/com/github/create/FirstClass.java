package com.github.create;
public class FirstClass {
	public static void main(String[] args) {   
		for(int i=0;i<=5;i++) {
			for(int y=0; y<=10-i;y++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int y=0; y<=10-i;y++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		}
}
