package Jenkinpractice.Jenkinpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class divtest {
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
	void test() {
		double result = test.divide(4,0);
		assertEquals(-1.0, result);
	}

}
