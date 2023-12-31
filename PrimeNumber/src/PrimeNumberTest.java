import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class PrimeNumberTest {
	private int firstNumber;
	private boolean b;
	private PrimeNumber prime;
	public PrimeNumberTest(int firstNumber, boolean b) {
		super();
		this.firstNumber = firstNumber;
		this.b = b;
	}
	@Before
	public void initialize() { 
		prime = new PrimeNumber();
	}
	@Parameterized.Parameters 
	public static Collection input() {
		return Arrays.asList(new Object[][] { {2, true}, {3, true}, {5, true}, {7, true}, {12, false}, {12,false}, {14, false}, {15, false}});
	}
	
	@Test
	public void testAirthematicTest() {
		System.out.println("Result for : "+ firstNumber + ", is "  + prime.primeCHeck(firstNumber)); 
		assertEquals(b, prime.primeCHeck(firstNumber));
	}
}