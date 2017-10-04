package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

public class myIntegerTest 
{
	
	// Test Constructor and getter 
	@Test
	public void testGetterAndConstructor() 
	{
		MyInteger myInt = new MyInteger(1);
		assertEquals(myInt.getiValue(), 1);
	} 
	
	// Test even methods
	@Test
	public void testTrueEven() 
	{
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isEven());
	}
	
	@Test
	public void testFalseEven() 
	{
		MyInteger myInt = new MyInteger(11);
		assertFalse(myInt.isEven());
	}
	
	// Test odd methods
	@Test
	public void testTrueOdd() 
	{
		MyInteger myInt = new MyInteger(9);
		assertTrue(myInt.isOdd());
	}
	
	@Test
	public void testFalseOdd() 
	{
		MyInteger myInt = new MyInteger(10);
		assertFalse(myInt.isOdd());
	}
	
	// Test prime methods
	@Test
	public void testTruePrime() 
	{
		MyInteger myInt = new MyInteger(5);
		assertTrue(myInt.isPrime());
	}
	
	@Test
	public void testFalsePrime() 
	{
		MyInteger myInt = new MyInteger(12);
		assertFalse(myInt.isPrime());
	}
	
	// Test equals method
	@Test
	public void testTrueEquals()
	{ 
		MyInteger myInt = new MyInteger(7);
		assertTrue(myInt.isEquals(7));
	}
	
	@Test
	public void testFalseEquals()
	{
		MyInteger myInt = new MyInteger(1);
		assertFalse(myInt.isEquals(9));
	}
}