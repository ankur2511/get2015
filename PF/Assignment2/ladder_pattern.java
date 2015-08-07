package pf_assignment_2;

public class ladder_pattern
{
	public String numbers(int row,int n) 
	{
		String s="";
		for(int k=1;k<=n-row+1;k++)
		{
			s=s+k;
		}
		return s;
		
		
	}
	
	public String space(int row,int n)
	{
		String s="";
		for (int k=row; k>1; k--) 
			s=s +" " ;
		return s;
	}
	public String[] fullLadder(int n) 
	{
		String s[]=new String[n];
		
		for(int i=1,j=0;i<=n;i++,j++)
		{
			
			s[j]=space(i,n)+numbers(i, n);
			
			
		}
		return s;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ladder_pattern obj1=new ladder_pattern();
		String s[]=obj1.fullLadder(5);
		for(int i=0;i<5;i++)
		{
			System.out.print(s[i]);
			System.out.println();
		}
		
	}

}
