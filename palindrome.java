package com.bridgelabz;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n,rev=0,z;
	System.out.println("Enter a Number");
	n=scanner.nextInt();
	z=n;
	while(n>0)
	    {
		rev=(rev*10)+n%10;
		n=n/10;
		}
	if(rev==z)
		System.out.println("Its a Palindrome");
	else
		System.out.println("Not a Palindrome");
}
}
