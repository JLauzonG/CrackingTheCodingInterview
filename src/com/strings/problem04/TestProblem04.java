package com.strings.problem04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void testArnaud() {
		assertTrue(SolutionArnaud.isPalindromAnagram("Tact Coa"));
		assertFalse(SolutionArnaud.isPalindromAnagram("lavall"));
	}
}
