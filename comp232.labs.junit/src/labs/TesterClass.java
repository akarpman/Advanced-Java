package labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import labs.ComplexNumbers;

public class TesterClass {

	@BeforeClass
	public static void testSetup() {
	}
	@AfterClass
	public static void testCleanup() {
	}
	/*@Test//(expected - IllegalArguementException.class)
	public void testExceptionIsThrown() {
		ComplexNumbers tester = new ComplexNumbers();
		tester.add(tester);
	}*/  //this is a failure test
	@Test
	public void testAdd() {
		ComplexNumbers tester1 = new ComplexNumbers(20, 100);
		ComplexNumbers tester2 = new ComplexNumbers(20, 100);
		assertEquals(240,tester1.add(tester2),"10 x 5 must be 50");
	}

}
