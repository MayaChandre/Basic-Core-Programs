package com.bridgelabz.basic_core_programming.leapyear;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args)
	{

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Year: ");
	        int an = scanner.nextInt();
	        System.out.println("Enter a leap year to check if it is a leap year: ");
	        int yeartocheck = scanner.nextInt();
	        boolean isleapyear = false;
			if(Integer.toString(yeartocheck).length()==4)
	        {
	        	if(yeartocheck % 4 ==0 ) {
	        		if(yeartocheck % 100 ==0 ) {
	        			if(yeartocheck % 400 ==0 ) {
	        			}
	        			else
	        			{
	        				isleapyear  = false;
	        				
	        			}
	        			isleapyear = true;
	        			}
	        		
	        		else {
	        			isleapyear = false;
	        		}
	        		isleapyear = true;
	        			
	        		}
	        	else {
	        		isleapyear = false;
	        	}
	        }
	        
    }
    System.out.println("is leap year: "+isleapyear);
    
}
    }
}
