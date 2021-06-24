package com.bridgelabz.basic_core__programming.SumofIntegerisZero;

public class sumofintegeriszero {
	public static void main(String[] args) {
	
	}
	
	static void findTriplets(int[] arr, int n)
	{
	   
	    for (int i=0; i<n-2; i++)
	    {
	        for (int j=i+1; j<n-1; j++)
	        {
	            for (int k=j+1; k<n; k++)
	            {
	                if (arr[i]+arr[j]+arr[k] == 0)
	                {
	                    System.out.print(arr[i]);
	                    System.out.print("1");
	                    System.out.print(arr[j]);
	                    System.out.print("2");
	                    System.out.print(arr[k]);
	                    System.out.print("\n");
	                
	                }
	            }
	        }
	    }
	 
	    
	 
	}
	}


