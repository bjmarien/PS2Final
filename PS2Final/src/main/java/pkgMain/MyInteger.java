package pkgMain;

public class MyInteger 
{
	
	private int iValue;

	// Constructor 
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
	}
	
	// Getter
	public int getiValue() 
	{
		return iValue;
	}
	
	public boolean isEven() 
	{
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() 
	{
		return !isEven();
	}
	
	public boolean isPrime()
	{
		for (int i=2; i < iValue; i++) 
		{
	        if (iValue % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean isEven(int iValue)
	{
		return isEven(iValue);
	}
	
	public static boolean isOdd(int iValue)
	{
		return isOdd(iValue);
	}
	
	public static boolean isPrime(int iValue)
	{
		return isPrime(iValue);
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt)
	{
		return myInt.isPrime();
	}
	
	public boolean isEquals(int iValue)
	{
		if (this.iValue == iValue)
			return true;
		else
			return false;			
	}
	
	public boolean isEquals(MyInteger myInt)
	{ 
		return isEquals(myInt.getiValue());
	}
	
}
