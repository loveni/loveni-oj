package name.loveni.oj.leetcode.big_number;

public class AddBinary {
	
	public int getBit(String num,int index) {
		if(num==null||num.length()==0||index<0)
			throw new IllegalArgumentException();
		if(index>=num.length())
			return 0;
		return num.charAt(index)-'0';
	}
	
	
	public String addBinary(String a, String b) {
        
		if(a==null||b==null)
			throw new IllegalArgumentException();
		a=(new StringBuffer(a)).reverse().toString();
		b=(new StringBuffer(b)).reverse().toString();
		
		StringBuffer result=new StringBuffer();
		int moreSign=0;
		for(int i=0;i<Math.max(a.length(), b.length());i++) {
			
			int one=getBit(a,i);
			int two=getBit(b,i);
			int sum=one+two+moreSign;
			moreSign=sum/2;
			sum=sum%2;
			if(sum==0)
				result.append("0");
			else
				result.append("1");
			
		}
		if(moreSign==1)
			result.append("1");
		return result.reverse().toString();
	}
}
