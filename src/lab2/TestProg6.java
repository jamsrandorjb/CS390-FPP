package lab2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestProg6 {

	private prog6 p;

	@Test
	void test() {
		p = new prog6();
		
		assertEquals(Arrays.toString(new String[] {"ha", "he", null, null}), Arrays.toString(prog6.removeDups(new String[] {"ha", "ha", "he", "he"})));
	}

}
