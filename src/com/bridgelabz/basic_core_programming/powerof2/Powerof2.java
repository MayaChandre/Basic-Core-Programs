package com.bridgelabz.basic_core_programming.powerof2;
import java.util.Scanner;
public class Powerof2
{
	public static void main (String[] args)
	{
    int a,b,f=0;
	Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		while(a!=1)
		{
			if(a%2!=0)
			{
				f=1;
			}
			a=a/2;
		}
		if(f==1)
		{
			System.out.print("no");
		}
		else

{
			System.out.print("yes");
			
		}

	}

		}


