package com.bridgelabz;

import java.util.Scanner;

public class naturalnumber {

public static void main(String[] args) {
	
	int n,sum=0;
	System.out.println("Enter no of terms");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	
	for (int i=0;i<=n;i++) 
	{
		sum=sum+i;
	}
	System.out.println("ADDITION:" +sum);
}
}
