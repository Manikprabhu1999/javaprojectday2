package com.bridgelabz;
import java.util.Scanner;
public class vowelConsonant {
public static void main(String[] args) {
	
	char ch;
	System.out.println("Enter Any Character");
	Scanner scanner=new Scanner(System.in);
	ch=scanner.next().charAt(0);

	if(ch=='a' && ch=='e' && ch=='i' && ch=='o' && ch=='u')
	{
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Consonant");
	}
	
}
}

