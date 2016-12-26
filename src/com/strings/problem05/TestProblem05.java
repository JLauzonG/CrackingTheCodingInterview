package com.strings.problem05;

import static org.junit.Assert.*;

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
	
	@Ignore
	public void testArnaud() {
		
	}
}
