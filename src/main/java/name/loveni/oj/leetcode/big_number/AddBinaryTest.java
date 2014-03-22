package name.loveni.oj.leetcode.big_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinaryTest {

	@Test
	public final void testAddBinary() {
		
		AddBinary ab=new AddBinary();
		assertEquals("0", ab.addBinary("0", "0"));
		assertEquals("1", ab.addBinary("0", "1"));
		assertEquals("11", ab.addBinary("10", "1"));
		assertEquals("11", ab.addBinary("1", "10"));
		assertEquals("100", ab.addBinary("11", "1"));
	}

}
