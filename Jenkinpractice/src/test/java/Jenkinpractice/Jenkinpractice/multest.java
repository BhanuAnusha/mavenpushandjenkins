package Jenkinpractice.Jenkinpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class multest {
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
		int result = test.multiply(3,4);
		assertEquals(12, result);
	}

}
