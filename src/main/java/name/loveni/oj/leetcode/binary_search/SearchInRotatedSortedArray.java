package name.loveni.oj.leetcode.binary_search;

public class SearchInRotatedSortedArray {

	
	public int compare(int x,int y,int sign,int bar) {
		if(x==y)
			return 0;
		
		if(sign==0) {
			if(x>y)
				return 1;
			else
				return -1;
		}
		else if(sign==1) {
			if(x<bar)
				return 1;
			else if(x>y)
				return 1;
			else 
				return -1;
		}
		else {
			if(x>=bar)
				return -1;
			else if(x>y)
				return 1;
			else 
				return -1;
		}
	}
	
	
	public int search(int[] A, int target) {
    
		if(A==null||A.length==0)
			return -1;
		if(A.length==1) {
			if(A[0]==target)
				return 0;
			else
				return -1;
		}
		
		int sign=0;
		int bar=0;
		if(A[0]>A[A.length-1]) {
			bar=A[0];
			if(target==A[0])
				return 0;
			else if(target>A[0])
				sign=1;
			else
				sign=-1;
		}
		
		int start=0,end=A.length-1;
		while(end>=start) {
			int mid=(end-start)/2+start;
			int cmp=compare(A[mid], target, sign, bar) ;
			if(cmp==0)
				return mid;
			else if(cmp==1) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
		
		
    }
	
	
	public static void main(String[] args) {
		

	}

}
