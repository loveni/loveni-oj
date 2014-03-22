package name.loveni.oj.leetcode.string;

public class WildcardMatching {

	public static void main(String[] args) {
		
		

	}
	
	public boolean isMatch(String s, String p) {
		if(s==null)
			s="";
		if(p==null)
			p="";
        return rMatch(s,p,0,0);
    }
	
	public boolean rMatch(String s, String p,int sIndex,int pIndex) {
        int sLen=s.length();
        int pLen=p.length();
        
        while(pIndex>0&&pIndex<pLen) {
        	if(p.charAt(pIndex)=='*'&&p.charAt(pIndex-1)=='*')
        		pIndex++;
        	else 
        		break;
        }
        
        while(true) {
        	if(sIndex==sLen&&pIndex==pLen) {
        		return true;
        	}
        	else if(pIndex==pLen) {
        		return false;
        	}
        	else if(sIndex==sLen) {
        		while(pIndex<pLen) {
        			if(p.charAt(pIndex)!='*')
        				return false;
        			pIndex++;
        		}
        		return true;
        	}
        	else {
        		
        		char pattern=p.charAt(pIndex);
        		if(pattern=='?') {
        			sIndex++;
        			pIndex++;
        			continue;
        		}
        		else if(pattern!='*') {
        			if(s.charAt(sIndex)==pattern) {
        				sIndex++;
            			pIndex++;
            			continue;
        			}
        			else
        				return false;
        		}
        		else {
        			for(int i=sIndex;i<=sLen;i++) {
        				if(rMatch(s, p, i, pIndex+1))
        					return true;
        			}
        			return false;
        		}
        		
        	}
        }
    }

}
