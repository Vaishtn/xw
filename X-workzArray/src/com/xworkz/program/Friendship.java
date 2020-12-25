package com.xworkz.program;

import java.util.Scanner;

public class Friendship {
	public static int num(int[] n,int a1) {
		int a,s=0;
		for (int i = 0; i <n.length; i++) {
			if (s<n[i]) {
				s=n[i];
				
			}
			
		}
		return s;
	}
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the bigger stick");
		int a1=in.nextInt();
		System.out.println("enter the element of array");
		int[] n=new int[a1];
		for(int i=0;i<a1;i++)
			n[i]=in.nextInt();
		int m=num(n,a1);
		System.out.println("largest num " +m);
	

	}

}
