package programa2a;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPosition {
	
	Position P;
	
	@Before
	public void init() {
		P = new Position();
	}

	@Test
	public void test1() {
		int[] f = {10, 20, 30};
		P.calculatePosition(3, f);
		assertEquals(80, P.getMinutes());
		boolean[] floor = P.getFloor();
		assertFalse(floor[0]);
		assertTrue(floor[1]);
		assertTrue(floor[2]);
		assertFalse(floor[3]);
		assertFalse(floor[4]);
	}
	
	@Test
	public void test2() {
		int[] f = {10, 30, 20};
		P.calculatePosition(3, f);
		assertEquals(60, P.getMinutes());
		boolean[] floor = P.getFloor();
		assertFalse(floor[0]);
		assertTrue(floor[1]);
		assertFalse(floor[2]);
		assertFalse(floor[3]);
		assertFalse(floor[4]);
	}
	
	@Test
	public void test3() {
		int[] f = {30, 10, 20};
		P.calculatePosition(3, f);
		assertEquals(100, P.getMinutes());
		boolean[] floor = P.getFloor();
		assertTrue(floor[0]);
		assertTrue(floor[1]);
		assertFalse(floor[2]);
		assertFalse(floor[3]);
		assertFalse(floor[4]);
	}
	
	@Test
	public void test4() {
		int[] f = {80, 50, 10, 5, 15};
		P.calculatePosition(5, f);
		assertEquals(290, P.getMinutes());
		boolean[] floor = P.getFloor();
		assertTrue(floor[0]);
		assertTrue(floor[1]);
		assertFalse(floor[2]);
		assertFalse(floor[3]);
		assertFalse(floor[4]);
	}

}
