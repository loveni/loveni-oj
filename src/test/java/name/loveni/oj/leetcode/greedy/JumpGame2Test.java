package name.loveni.oj.leetcode.greedy;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpGame2Test {

	@Test
	public final void test() {
		JumpGame2 jg=new JumpGame2();
		assertEquals(Integer.MAX_VALUE, jg.jump(new int []{0,5}));
		assertEquals(1, jg.jump(new int []{1}));
		assertEquals(2, jg.jump(new int []{1,1,3}));
		assertEquals(1, jg.jump(new int []{2,1}));
		assertEquals(2, jg.jump(new int []{1,2,3}));
	}

}
