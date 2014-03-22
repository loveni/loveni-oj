package name.loveni.oj.leetcode.dp;

public class WildcardMatching {
	
	
	public boolean isMatch(String s, String p) {
		
		if(s==null)
			s="";
		if(p==null)
			p="";
		
		int sLen=s.length()+1;
		int pLen=p.length()+1;
		
		boolean [][]isMatch=new boolean[pLen+1][sLen+1];
		
		for(int i=0;i<sLen;i++) {
			isMatch[0][i]=false;
		}
		isMatch[0][0]=true;
		
		for(int i=1;i<pLen;i++) {
			if(p.charAt(i-1)=='*'&&isMatch[i-1][0])
				isMatch[i][0]=true;
			else
				isMatch[i][0]=false;
		}
		
		
		for(int i=1;i<pLen;i++) 
			for(int j=1;j<sLen;j++) {
				
				if(p.charAt(i-1)=='*') {
					if(isMatch[i-1][j]||isMatch[i][j-1])
						isMatch[i][j]=true;
					else
						isMatch[i][j]=false;
				}
				else if((p.charAt(i-1)=='?')||(p.charAt(i-1)==s.charAt(j-1))) {
					if(isMatch[i-1][j-1])
						isMatch[i][j]=true;
					else
						isMatch[i][j]=false;
				}
				else 
					isMatch[i][j]=false;
			}
		
		return isMatch[pLen-1][sLen-1];
	}
}
