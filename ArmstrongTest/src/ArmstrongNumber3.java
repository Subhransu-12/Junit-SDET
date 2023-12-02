import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArmstrongNumber3 {
	@Test
    public void testArmstrongNumber() {
        int number = 407;
        assertEquals(true, isArmstrongNumber(number));
    }
    
    public boolean isArmstrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        
        while (number > 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, numberOfDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
}
