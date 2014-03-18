package name.loveni.oj.leetcode.binary_search;

public class SearchInsertPosition {

	
	public int searchInsert(int[] A, int target) {
		
		if(A==null||A.length==0) {
			return 0;
		}
		int start=0,end=A.length-1;
		while(end>=start) {
			
			if(end-start==1) {
				if(target>A[end])
					return end+1;
				else if(target>A[start])
					return end;
				else
					return start;
				
			}
			
			if(end==start) {
				if(A[start]>=target)
					return start;
				else
					return start+1;
			}
			
			int mid=start+(end-start)/2;
			
			if(A[mid]==target)
				return mid;
			else if(A[mid]>target) {
				end=mid-1;
			}
			else 
				start=mid+1;
		}
		return start;
        
    }
	
	public static void main(String[] args) {
		

	}

}
