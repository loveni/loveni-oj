package name.loveni.oj.leetcode.binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	@Test
	public final void testSearch() {
		SearchInRotatedSortedArray search=new SearchInRotatedSortedArray();
		
		//边界条件
		assertEquals(-1, 
				search.search(null, 0));
		assertEquals(-1, 
				search.search(new int[]{}, 0));
		
		assertEquals(-1, 
				search.search(new int[]{1}, 0));
		assertEquals(0, 
				search.search(new int[]{1}, 1));
		
		//顺序数组
		assertEquals(-1, 
				search.search(new int[]{1,2,3,4}, 0));
		assertEquals(0, 
				search.search(new int[]{1,2,3,4}, 1));
		assertEquals(1, 
				search.search(new int[]{1,2,3,4}, 2));
		assertEquals(2, 
				search.search(new int[]{1,2,3,4}, 3));
		assertEquals(3, 
				search.search(new int[]{1,2,3,4}, 4));
		assertEquals(-1, 
				search.search(new int[]{1,2,3,4}, 5));
		
		//旋转过后
		assertEquals(-1, 
				search.search(new int[]{3,4,1,2}, 0));
		assertEquals(0, 
				search.search(new int[]{3,4,1,2}, 3));
		assertEquals(1, 
				search.search(new int[]{3,4,1,2}, 4));
		assertEquals(2, 
				search.search(new int[]{3,4,1,2}, 1));
		assertEquals(3, 
				search.search(new int[]{3,4,1,2}, 2));
		assertEquals(-1, 
				search.search(new int[]{3,4,1,2}, 5));
	}

}
