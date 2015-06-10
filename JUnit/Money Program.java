class Money
{
	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency)
	{
		fAmount = amount;
		fCurrency = currency;
	}

	public int amount()
	{
		return fAmount;
	}

	public String currency()
	{
		return fCurrency;
	}
}

public Money add(Money m)
{
	return new Money(amount()+m.amount(), currency());
}

//implement a test in a subclass of TestCase.  
// to test our Money implementation, we will therefore definee MoneyTest as a subclass of TestCase




public class MoneyTest extends TestCase
{
	public void testSimpleAdd()
	   Money m12CHF = new Money(12, "CHF"); //(1)
	   Money m14CHF = new Money(14, "CHF");
	   Money expected = new Money(26)
}


// the equals in the object 
public boolean equals(Object anObject)
{
	if (anObject instance)
}