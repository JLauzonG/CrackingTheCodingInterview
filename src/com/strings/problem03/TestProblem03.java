package com.strings.problem03;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem03 {

	@Test
	public void testJeremy() {
		assertEquals(SolutionJeremy.URLify("Mr John Smith", ' ', "%20"), "Mr%20John%20Smith");
	}
	
	@Ignore
	public void testIvelina() {
		
	}
	
	@Ignore
	public void testArnaud() {
		
	}

}
