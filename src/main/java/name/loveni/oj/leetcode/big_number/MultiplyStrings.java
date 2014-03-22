package name.loveni.oj.leetcode.big_number;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getDigit(String num,int index) {
		if(num==null||index<0)
			throw new IllegalArgumentException();
		
		if(index>=num.length()) {
			return 0;
		}
		if(num.charAt(index)>'9'||num.charAt(index)<'0')
			throw new IllegalArgumentException();
		return num.charAt(index)-'0';
	}
	
	public String add(String num1,String num2) {
		
		if(num1==null||num1.length()==0||num2==null||num2.length()==0) 
			throw new IllegalArgumentException();
		
		num1=(new StringBuffer(num1)).reverse().toString();
		num2=(new StringBuffer(num2)).reverse().toString();
		int moreSign=0;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<Math.max(num1.length(), num2.length());i++) {
			int a=getDigit(num1,i);
			int b=getDigit(num2,i);
			int sum=a+b+moreSign;
			moreSign=sum/10;
			sum=sum%10;
			sb.append((char)(sum+'0'));
		}
		if(moreSign>0)
			sb.append("1");
		return sb.reverse().toString();
		
		
	}
	
	private final int digitPerGroup=8; 
	public String multiply(String num1, String num2) {
		
		if(num1==null||num1.length()==0||num2==null||num2.length()==0) 
			throw new IllegalArgumentException();
		
		int num1Times=(num1.length()-1)/digitPerGroup;
		int num2Times=(num2.length()-1)/digitPerGroup;
		
		String result="0";
		
		for(int i=0;i<=num1Times;i++) {
			
			int addZero1=num1.length()-digitPerGroup-i*digitPerGroup;
			long a=0;
			if(addZero1>=0) {
				a=Long.parseLong(num1.substring(i*digitPerGroup,i*digitPerGroup+digitPerGroup));
				
			}
			else {
				addZero1=0;
				a=Long.parseLong(num1.substring(i*digitPerGroup,num1.length()));
			}
			
			for(int j=0;j<=num2Times;j++) {
				
				int addZero2=num2.length()-digitPerGroup-j*digitPerGroup;
				long b=0;
				if(addZero2>=0) {
					b=Long.parseLong(num2.substring(j*digitPerGroup,j*digitPerGroup+digitPerGroup));
					
				}
				else {
					addZero2=0;
					b=Long.parseLong(num2.substring(j*digitPerGroup,num2.length()));
				}
			
			
			long mul=a*b;
			StringBuffer sb=new StringBuffer();
			sb.append(mul);
			
			if(mul>0) 
				for(int k=0;k<addZero1+addZero2;k++) {
					sb.append("0");
				}
			
			result=add(result,sb.toString());
			
			
			}
			
		}
		
		return result;
		
		
    }



}
