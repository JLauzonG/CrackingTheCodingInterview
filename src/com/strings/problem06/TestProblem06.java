package com.strings.problem06;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem06 {

	@Test
	public void testJeremy() {
		assertEquals(SolutionJeremy.compressString("aabcccccaaa"), "a2b1c5a3"); 
		assertEquals(SolutionJeremy.compressString("abc"), "abc"); 
	}
	
	@Ignore
	public void testIvelina() {
		
	}
	
	@Ignore 
	public void testArnaud() {
		
	}
}
