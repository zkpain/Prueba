package jenkins.testlink.example;





import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Testprueba {
	protected int value1, value2;

	// assigning the values
	@Before
	public void setUp() {
		value1 = 3;
		value2 = 4;
	}

	// test method to add two values
	@Test
	public void testAdd() {
		System.out.println("***********************testAdd*************************");
		int result = value1 + value2;
		assertTrue(false);
	
		
	}
}
