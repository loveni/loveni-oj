package name.loveni.oj.leetcode.greedy;

public class JumpGame2 {
	
	public int jump(int[] A) {
		if(A==null||A.length==0)
			throw new IllegalArgumentException();
		if(A.length==1)
			return 0;
		
		int curr=0,next=1,step=0;
		while(true) {
			
			step++;
			if(A[curr]==0)
				break;
			int max=0,maxPos=0;
			for(int i=next;i<=curr+A[curr];i++) {
				if(i>=A.length-1)
					return step;
				else {
					if(A[i]+i>=max) {
						max=A[i]+i;
						maxPos=i;
					}
				}
			}
			next=curr+A[curr]+1;
			curr=maxPos;
			
			
		}
		
		return Integer.MAX_VALUE;
    }
}
