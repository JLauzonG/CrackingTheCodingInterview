package com.strings.problem05;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem05 {

	@Test
	public void testJeremy() {
		assertTrue(SolutionJeremy.isOneEditAway("pale", "ple"));
		assertTrue(SolutionJeremy.isOneEditAway("pales", "pale"));
		assertTrue(SolutionJeremy.isOneEditAway("pale", "bale"));
		
		assertFalse(SolutionJeremy.isOneEditAway("pale", "bake"));
	}
	
	@Ignore
	public void testIvelina() {
		
	}
	
	@Test
	public void testArnaud() {
		assertTrue(SolutionArnaud.isOneEditAway("pale", "ple"));
		assertTrue(SolutionArnaud.isOneEditAway("pales", "pale"));
		assertTrue(SolutionArnaud.isOneEditAway("pale", "bale"));
		
		assertFalse(SolutionArnaud.isOneEditAway("pale", "bake"));
	}
}
