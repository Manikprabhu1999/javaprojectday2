package com.bridgelabz;
import java.util.Scanner;
public class monthName {
public static void main(String s[]) {
Scanner scanner =new Scanner(System.in);
 System.out.println("Enter The Month Number to Get Month Name");
 int MonthNumber=scanner.nextInt();
 int mn=MonthNumber;
 
 	if(mn<=0)
 	{
 		System.out.println("Enter a number from 1 to 12");
 	}
    if(mn>=13)
    {
    	System.out.println("Enter a number from 1 to 12");
    }
    else if (mn==1)
    {
    	System.out.println("The Month Is JANUARY");
    }
    else if (mn==2)
    {
    	System.out.println("The Month Is FEBRUARY");
    }
    else if (mn==3)
    {
    	System.out.println("The Month Is MARCH");
    }
    else if (mn==4)
    {
    	System.out.println("The Month Is APRIL");
    }
    else if (mn==5)
    {
    	System.out.println("The Month Is MAY");
    }
    else if (mn==6)
    {
    	System.out.println("The Month Is JUNE");
    }
    else if (mn==7)
    {
    	System.out.println("The Month Is JULY");
    }
    else if (mn==8)
    {
    	System.out.println("The Month Is AUGUST");
    }
    else if (mn==9)
    {
    	System.out.println("The Month Is SEPTEMBER");
    }
    else if (mn==10)
    {
    	System.out.println("The Month Is OCTOBER");
    }
    else if (mn==11)
    {
    	System.out.println("The Month Is NOVEMBER");
    }
    else if (mn==12)
    {
    	System.out.println("The Month Is DECEMBER");
    }
  
	    }
	}