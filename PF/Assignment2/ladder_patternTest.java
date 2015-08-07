package pf_assignment_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ladder_patternTest {

	ladder_pattern ob=new ladder_pattern();
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
		
		String expected[]={"12345"," 1234","  123","    12","    1"};
		String s1[]=ob.fullLadder(5);
		for(int i=0;i<9;i++)
		{
			assertEquals("Correct",expected[i],s1[i]);
		}
}
}
