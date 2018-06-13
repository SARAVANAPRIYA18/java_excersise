package com.training.examples;

import java.util.Scanner;

public class Password{
	public int findPassword(int input1, int input2, int input3, int input4, int input5) {
		 int a[]= {input1,input2,input3,input4,input5};
		 int i;
		 int password=0;
		 for(i=0;i<a.length;i++) {
		 int b[]=new int[10];
			int number=a[i]; 
				
	         	int result=countCheck(b,a,i);
	        
				if(result != 0) 
				{
				password=password+number;	
					}
				}
			return password;
	}

	public int countCheck(int b[],int[] a,int i) {
		int n;
		while(a[i]!=0)
		{
			
		    n=a[i]%10;
		
			b[n]=b[n]+1;
			
		 	a[i]=a[i]/10;	
		}
			
		int max=b[0];
		int value=0,value1=0;
	for( i=1;i<b.length;i++)
	{
			
			if(b[i]>max) 
			 {
			max=b[i];
		
	         }
		}
	for( i=0;i<b.length;i++) 
	{
		if(max==b[i] || b[i]==0)
		{
			
			value++;
		}else
		{
			value1++;
		
		}
		
	}
	return value1;
	}
	
	
	public static void main(String[] args) {
		Password find=new Password();
		int result=find.findPassword(565,78,9899,467,989);
		System.out.println("password : "+result);
		
	}
	}
	
	
	
	
	

