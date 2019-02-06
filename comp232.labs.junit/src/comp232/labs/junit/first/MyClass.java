package comp232.labs.junit.first;

public class MyClass {
	public int multiply (int x, int y)
	{
		if (x > 999)
		{
			throw new IllegalArgumentException("X should be less then 1000");
		}
		return x * y;//doesn't / divide?  Seems silly to have a function that says multiply when it actually divides
	}
}
