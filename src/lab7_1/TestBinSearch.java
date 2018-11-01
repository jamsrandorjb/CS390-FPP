package lab7_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBinSearch {
	private BinSearch b;
	
	@Test
	void test() {
		b = new BinSearch();
		assertEquals(false, b.search("hahahhahaha", 'c'));
		
	}

}


