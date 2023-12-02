import org.junit.Test;
import static org.junit.Assert.*;

public class NumberCheckerTest {

    @Test
    public void testIsEvenWithEvenNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.isEven(4));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.isEven(7));
    }

    @Test
    public void testIsEvenWithZero() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.isEven(0));
    }

    @Test
    public void testIsEvenWithNegativeEvenNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.isEven(-6));
    }

    @Test
    public void testIsEvenWithNegativeOddNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.isEven(-3));
    }
}


