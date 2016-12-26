package com.strings.problem04;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem04 {

	@Test
	public void testJeremy() {
		assertTrue(SolutionJeremy.isPalindromePermutation("Tact Coa"));
		assertFalse(SolutionJeremy.isPalindromePermutation("lavall")); 
	}
	
	@Ignore
	public void testIvelina() {

	}
	
	@Ignore
	public void testArnaud() {
	
	}
}
