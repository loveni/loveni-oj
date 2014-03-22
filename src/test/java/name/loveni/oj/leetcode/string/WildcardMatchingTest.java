package name.loveni.oj.leetcode.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class WildcardMatchingTest {

	@Test
	public void test() {
		WildcardMatching matcher=new WildcardMatching();
		assertEquals(true, 
				matcher.isMatch(null, null));
		assertEquals(true, 
				matcher.isMatch(null, ""));
		assertEquals(true, 
				matcher.isMatch(null, "*"));
		assertEquals(true, 
				matcher.isMatch(null, "**"));
		assertEquals(true, 
				matcher.isMatch("a", "a"));
		assertEquals(true, 
				matcher.isMatch("a", "?"));
		assertEquals(false, 
				matcher.isMatch("a", "b"));
		
		assertEquals(false, 
				matcher.isMatch("a", "b*"));
		assertEquals(true, 
				matcher.isMatch("a", "?*"));
		assertEquals(false, 
				matcher.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));
		
		assertEquals(false, 
				matcher.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb", "*aa*ba*a*bb*aa*ab*a*aaaaaa*a*aaaa*bbabb*b*b*aaaaaaaaa*a*ba*bbb*a*ba*bb*bb**a*b*bb"));
	}

}
