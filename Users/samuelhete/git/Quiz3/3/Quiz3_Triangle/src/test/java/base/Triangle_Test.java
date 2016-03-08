package base;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test extends Triangle{
	
	/**
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * constructs new triangle
	 */
	public Triangle_Test(int sideA, int sideB, int sideC) {
		Triangle tri = new Triangle_Test(15,34,35);
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	protected double sideA, sideB, sideC;
	
	/**
	 * Tests whether given acute triangle of sides 15, 34, and 35 results in
	 *  Perimeter of 94 and Area of 252 as expected 
	 */
	@Test
	public void test() {
		Triangle tri = new Triangle_Test(15,34,35);
		
		double triPerimeter = tri.getPerimeter();
		assertEquals(94, triPerimeter, 0.0);
		
		double triArea = tri.getArea();
		assertEquals(252.0, triArea, 0.0);
	}
}


