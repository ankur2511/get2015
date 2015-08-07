package pf_assignment_2;

import java.util.Scanner;

public class pyramid_pattern 
{
	
	public String space (int row,int n) 
	{
		String s="";
		for(int i=0;i<n-row||i<row-n;i++)
		{
			s=s +" " ;
		}
		return s;
	}
	
	public String numbers(int row,int n)
	{
		String s="";
		int j,k;
		    if(row<=n)
		    	
		    {
		    	for( j=1;j <=row;j++)
					s=s+j;
				for( k=row-1;k >=1;k--)
					s=s+k;
		    }
		    else
		    {
		    	for(j=1;j<=2*n-row;j++)
		    		s=s+j;
		    	for(k=2*n-row-1;k >=1;k--)
		    		s=s+k;
		    }
		    pyramid_pattern obj=new pyramid_pattern();
		    obj.space(row, n);
		    return s;
	}
	
	public String[] full_Pyramid(int n)
	{
		String s[]=new String[2*n];
		
		for(int i=1,j=0;i<2*n;i++,j++)
		{
			s[j]=space(i, n)+numbers(i, n);
			
		}
		
		return s;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements you want to print");
		int c=sc.nextInt();
		pyramid_pattern obj=new pyramid_pattern();
		String s[]=obj.full_Pyramid(c);
		for(int i=0;i<2*c-1;i++)
		{
			
			System.out.print(s[i]);
			System.out.println();
		}
	
		//String s=obj.space(2, 5);
		//System.out.print(s);

		}
		

	}


