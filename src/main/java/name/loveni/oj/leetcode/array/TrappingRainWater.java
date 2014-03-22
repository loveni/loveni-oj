package name.loveni.oj.leetcode.array;

public class TrappingRainWater {

	public int trap(int[] A) {
        
		if(A==null||A.length<=2)
			return 0;
		
		int []leftMax=new int[A.length];
		int [] rightMax=new int[A.length];
		
		leftMax[0]=0;
		for(int i=0;i<A.length;i++) {
			leftMax[i]=Math.max(A[i-1],leftMax[i-1]);
		}
		
		rightMax[A.length-1]=0;
		for(int i=A.length-1;i>=0;i--) {
			rightMax[i]=Math.max(A[i+1], rightMax[i+1]);
		}
		
		int ret=0;
		
		for(int i=1;i<A.length-1;i++) {
			int min=Math.min(leftMax[i],rightMax[i]);
			if(min>A[i])
				ret+=(min-A[i]);
		}
		return ret;
		
		
    }

}
