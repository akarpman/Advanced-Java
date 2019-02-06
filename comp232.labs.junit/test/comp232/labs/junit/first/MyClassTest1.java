package comp232.labs.junit.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest1 {

	@BeforeClass
	public static void testSetup() {
	}
	@AfterClass
	public static void testCleanup() {
	}
	/*@Test//(expected - IllegalArguementException.class)
	public void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		tester.multiply(1000, 5);
	}*/
	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals(50,tester.multiply(10, 5),"10 x 5 must be 50");
	}

}
