package Jenkinpractice.Jenkinpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class addtest {
	private mathutils test;

	@BeforeEach
	void setUp() throws Exception {
		test = new mathutils();
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
	}

	@Test
	void addtestJ() {
		int result = test.add(3,4);
		assertEquals(7, result);
	}

}
