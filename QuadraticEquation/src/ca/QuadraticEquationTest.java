package ca;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuadraticEquationTest {
	@Test
	public void testRealRoots1() {
	QuadraticEquation q = new QuadraticEquation();
	assertTrue(q.hasRealRoots(1, -5, 6));
	}

	@Test
	public void testRealRoots2() {
	QuadraticEquation q = new QuadraticEquation();
	assertTrue(q.hasRealRoots(-3, 6, -3));
	}

	@Test
	public void testRealRoots3() {
	QuadraticEquation q = new QuadraticEquation();
	assertTrue(q.hasRealRoots(1, 4, 4));
	}

	@Test
	public void testRealRoots4() {
	QuadraticEquation q = new QuadraticEquation();
	assertTrue(q.hasRealRoots(0, 5, 3));
	}

	@Test
	public void testRealRoots5() {
	QuadraticEquation q = new QuadraticEquation();
	assertTrue(q.hasRealRoots(2, 0, -8));
	}

	@Test
	public void testImaginaryRoots1() {
	QuadraticEquation q = new QuadraticEquation();
	assertFalse(q.hasRealRoots(2, 4, 5));
	}

	@Test
	public void testImaginaryRoots2() {
	QuadraticEquation q = new QuadraticEquation();
	assertFalse(q.hasRealRoots(3, 2, 7));
	}

	@Test
	public void testImaginaryRoots3() {
	QuadraticEquation q = new QuadraticEquation();
	assertFalse(q.hasRealRoots(1, 2, 2));
	}
}

