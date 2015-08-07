package pf_assignment_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class pyramid_patternTest
{
	pyramid_pattern ob=new pyramid_pattern();

	@Test
	public void test1() 
	{
		String s1=ob.space(3,5);
		assertEquals("Correct","  ",s1);
	}
	public void test2() 
	{
		String s1=ob.numbers(3,5);
		assertEquals("Correct","  ",s1);
	}
	public void test3()
	{
		
		String expected[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		String s1[]=ob.full_Pyramid(5);
		for(int i=0;i<9;i++)
		{

			assertEquals("Correct",expected[i],s1[i]);
		}
	}
}
