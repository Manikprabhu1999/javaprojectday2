package com.bridgelabz;

public class UnitTenHundred {
	public static void main(String[] args) {
	long num=1101001800;
	
	long unit=(num%10);
	long ten=(num/10)%10;
	long hundred=(num/100)%10;
	
	System.out.println("The units place is:"+ unit);
	System.out.println("The tens place is:"+ ten);
	System.out.println("The hundreds place is:"+ hundred);
}
}