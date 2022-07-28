import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.validator.PublicClassValidator;

class findMaxTest {
	@Test
	public void findMaxTest() {
		assertEquals(4,Calculation.findMax(new int[] {1,2,3,4,5}));
		}
     
}


