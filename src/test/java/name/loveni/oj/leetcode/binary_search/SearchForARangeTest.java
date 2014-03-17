package name.loveni.oj.leetcode.binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchForARangeTest {

	@Test
	public final void test() {
		SearchForARange search=new SearchForARange();
		
		//边界条件
		assertArrayEquals(new int[]{-1,-1},
				search.searchRange(null, 1));
		
		assertArrayEquals(new int[]{-1,-1},
				search.searchRange(new int[]{}, 1));
		
		assertArrayEquals(new int[]{-1,-1},
				search.searchRange(new int[]{0}, 1));
		
		assertArrayEquals(new int[]{0,0},
				search.searchRange(new int[]{1}, 1));
		assertArrayEquals(new int[]{0,1},
				search.searchRange(new int[]{1,1}, 1));
		
		assertArrayEquals(new int[]{1,2},
				search.searchRange(new int[]{1,2,2,3,3,5}, 2));
		
		
	}

}
