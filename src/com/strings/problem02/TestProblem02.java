package com.strings.problem02;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem02 {

	@Test
	public void testJeremy() {
		assertTrue(SolutionJeremy.checkPermutation("dog", "ogd")); 
		assertFalse(SolutionJeremy.checkPermutation("dog", "dogs")); 
		assertFalse(SolutionJeremy.checkPermutation("dog", "bog"));
		// assertFalse(SolutionJeremy.checkPermutation("ddog", "bbog"));
	}

	@Ignore
	public void testIvelina() {
		
	}
	
	@Test
	public void testArnaud() {
		assertTrue(SolutionArnaud.areAnagrams("dog", "ogd"));
		assertFalse(SolutionArnaud.areAnagrams("dog", "dogs"));
		assertFalse(SolutionArnaud.areAnagrams("dog", "bog"));
		assertFalse(SolutionArnaud.areAnagrams("ddog", "bbog"));
	}
}
