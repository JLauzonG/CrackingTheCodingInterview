package com.strings.problem02;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem02 {

	@Test
	public void testJeremy() {
		assertTrue(SolutionJeremy.checkPermutation("dog", "ogd")); 
		assertFalse(SolutionJeremy.checkPermutation("dog", "dogs")); 
		assertFalse(SolutionJeremy.checkPermutation("dog", "bog")); 
	}

	@Ignore
	public void testIvelina() {
		
	}
	
	@Ignore
	public void testArnaud() {
		
	}
}
