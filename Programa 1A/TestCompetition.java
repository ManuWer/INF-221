package progama1a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCompetition {
	
	Competition C;
	
	@Before
	public void init() {
		C = new Competition();
	}
	
	@Test
	public void testCompetitionC3() {
		int[] points = {1, 2, 3};
		C.competition(3, 1, points);
		int classified = C.getClassified();
		double[] stats = C.getStats();

		assertEquals(1, classified);
		assertEquals(0.0, stats[0], 0.01);
		assertEquals(3.0, stats[1], 0.01);
		assertEquals(0.81, stats[2], 0.01);
		assertEquals(2.0, stats[3], 0.01);
	}
	
	@Test
	public void testCompetitionC4() {
		int[] points = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		C.competition(10, 3, points);
		int classified = C.getClassified();
		double[] stats = C.getStats();

		assertEquals(4, classified);
		assertEquals(0.5, stats[0], 0.01);
		assertEquals(4.5, stats[1], 0.01);
		assertEquals(1.41, stats[2], 0.01);
		assertEquals(3.0, stats[3], 0.01);
	}
	
	@Test
	public void testCompetitionC5() {
		int[] points = {1, 2};
		C.competition(2, 2, points);
		int classified = C.getClassified();
		double[] stats = C.getStats();

		assertEquals(2, classified);
		assertEquals(0.5, stats[0], 0.01);
		assertEquals(1.5, stats[1], 0.01);
		assertEquals(0.5, stats[2], 0.01);
		assertEquals(1.5, stats[3], 0.01);
	}

}
