package name.loveni.oj.leetcode.dp;

import static org.junit.Assert.*;


import org.junit.Test;

public class WildcardMatchingTest {

	@Test
	public final void test() {
		WildcardMatching wm=new WildcardMatching();
		
		assertEquals(true, wm.isMatch(null, null));
		assertEquals(true, wm.isMatch(null, "*"));
		assertEquals(true, wm.isMatch("a", "a*"));
		assertEquals(true, wm.isMatch("a", "?"));
		assertEquals(false, wm.isMatch("a", "n"));
		
		assertEquals(true, wm.isMatch("ab", "a?"));
		assertEquals(true, wm.isMatch("ab", "a*"));
		assertEquals(true, wm.isMatch("abc", "a*c"));
		assertEquals(false, wm.isMatch("abcd", "a*c"));
		
		
	}

}
