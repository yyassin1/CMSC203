import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import gradebook.GradeBook;
import static org.junit.Assert.*;


public class GradeBookTester 
{
	private GradeBook g1;
	private GradeBook g2;
	
@Before
	public void setUp() 
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(80);
		g2.addScore(90);
	}
  
	@After
	public void tearDown() 
	{
		g1 = null;
		g2 = null;
	}

	@Test
	public void testSum()
	{
		assertEquals(125,g1.sum(),0.001);
		assertEquals(170,g2.sum(),0.001);
	}
	@Test
	public void testMinimum()
	{
		assertEquals(50,g1.minimum(),0.001);
		assertEquals(80,g2.minimum(),0.001);
	}
	@Test
	public void addScoreTest()
	{	
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("80.0 90.0 "));
	}
	@Test
	public void finalScoreTest()
	{
		assertEquals(75,g1.finalScore(),0.001);
		assertEquals(90,g2.finalScore(),0.001);
	}
  
}