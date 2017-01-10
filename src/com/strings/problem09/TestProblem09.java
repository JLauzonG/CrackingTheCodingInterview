package com.strings.problem09;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem09 {

	@Test
	public void testJeremy() {
		assertTrue(SolutionJeremy.isStringRotation("erbottlewat", "waterbottle")); 
		assertFalse(SolutionJeremy.isStringRotation("efbottlewat", "waterbottle"));
	}
	
	@Ignore
	public void testIvelina() {
		
	}
	
	@Ignore
	public void testArnaud() {
		
	}
}
