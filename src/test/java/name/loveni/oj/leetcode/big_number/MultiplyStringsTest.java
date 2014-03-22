package name.loveni.oj.leetcode.big_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyStringsTest {

	@Test
	public final void testAdd() {
		
		MultiplyStrings ms=new MultiplyStrings();
		
		assertEquals("3", ms.add("1", "2"));
		assertEquals("33", ms.add("12", "21"));
		assertEquals("23", ms.add("2", "21"));
		assertEquals("112", ms.add("85", "27"));
	}

	@Test
	public final void testMultiply() {
		//fail("Not yet implemented"); // TODO
		
		MultiplyStrings ms=new MultiplyStrings();
		
		assertEquals("2", ms.multiply("1", "2"));
		assertEquals("144", ms.multiply("12", "12"));
		assertEquals("1440", ms.multiply("12", "120"));
		assertEquals("144000", ms.multiply("120", "1200"));
		assertEquals("1082152022374638", ms.multiply("87654321", "12345678"));
		assertEquals("121932631112635269", ms.multiply("987654321", "123456789"));
		assertEquals("0", ms.multiply("0", "332620029"));
		
	}

}
