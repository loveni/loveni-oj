package name.loveni.oj.leetcode.binary_search;

public class SearchForARange {

	public int compare(int[] A,int index,int target,boolean lower) {
		
		if(A[index]<target)
			return -1;
		else if(A[index]>target)
			return 1;
		else if(lower) {
			if(index==0)
				return 0;
			else if(A[index-1]!=target)
				return 0;
			else 
				return 1;
		}
		else {
			if(index==A.length-1)
				return 0;
			else if(A[index+1]!=target) {
				return 0;
			}
			else
				return -1;
		}
		
	}
	
	public int[] searchRange(int[] A, int target) {
     
		if(A==null||A.length==0)
			return new int[] {-1,-1};
		int start=0,end=A.length-1;
		int lower=-1;
		
		while(end>=start) {
			int mid=(end-start)/2+start;
			int cmp=compare(A,mid,target,true);
			if(cmp==0) {
				lower=mid;
				break;
			}
			else if(cmp==1) {
				end=mid-1;
			}
			else
				start=mid+1;
		}
		if(lower==-1)
			return new int[] {-1,-1};
		
		start=0;
		end=A.length-1;
		int upper=-1;
		while(end>=start) {
			int mid=(end-start)/2+start;
			int cmp=compare(A,mid,target,false);
			if(cmp==0) {
				upper=mid;
				break;
			}
			else if(cmp==1) {
				end=mid-1;
			}
			else
				start=mid+1;
		}
		return new int[]{lower,upper};
		
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
