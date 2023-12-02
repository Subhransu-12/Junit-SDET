import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest{
	@Test
	public void rightCase1() {
		Palindrome p1=new Palindrome();
		assertTrue(p1.isPalindrome(1111));
	}
	@Test
	public void rightCase2() {
		Palindrome p2=new Palindrome();
		assertTrue(p2.isPalindrome(1221));
	}
	@Test
	public void rightCase3() {
		Palindrome p3=new Palindrome();
		assertTrue(p3.isPalindrome(1331));
	}
	@Test
	public void rightCase4() {
		Palindrome p4=new Palindrome();
		assertTrue(p4.isPalindrome(1441));
	}
	@Test
	public void rightCase5() {
		Palindrome p5=new Palindrome();
		assertTrue(p5.isPalindrome(1551));
	}
}
