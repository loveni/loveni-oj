package name.loveni.oj.leetcode.permute;

import java.util.*;

public class Permutations2 {
	
	public static void main(String [] args) {
		Permutations2 p=new Permutations2();
		ArrayList<ArrayList<Integer>> result=p.permute(new int []{1,3,1});
		for(ArrayList<Integer> item : result) {
			for(Integer i:item) {
				System.out.print(i);
				System.out.print(",");
			}
			System.out.println("");
		}
		
	}
	
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
        return permuteUnique(num);
    }
	
	public boolean incr(int [] order) {
		order[0]++;
		for(int i=0;i<order.length-1;i++) {
			if(order[i]>i) {
				order[i+1]++;
				order[i]=0;
			}
		}
		if(order[order.length-1]==order.length)
			return false;
		else
			return true;
	}
	
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		if(num==null||num.length==0)
			return result;
		
		int [] order=new int [num.length];
		for(int i=0;i<order.length;i++)
			order[i]=0;
		
		while(true) {
			
			int [] itemIndex=new int[num.length];
			for(int i=0;i<itemIndex.length;i++)
				itemIndex[i]=-1;
			boolean valid=true;
			int lastpos=-1;
			for(int i=0;i<itemIndex.length;i++) {
				
				int skip=order[order.length-i-1];
				
				for(int j=0;j<itemIndex.length;j++) {
					if(itemIndex[j]!=-1)
						continue;
					else if(skip>0) {
						skip--;
						continue;
					}
					else {
						//the i item should put to the j pos
						itemIndex[j]=i;
						if(i>0) {
							//check duplicate
							if(num[i-1]==num[i]) {
								if(j<lastpos) {
									valid=false;
									break;
								}
							}
						}
						lastpos=j;
						break;
					}
				}
				if(valid==false)
					break;
			}
			if(valid) {
				ArrayList<Integer> item=new ArrayList<Integer>();
				for(int i=0;i<itemIndex.length;i++)
					item.add(num[itemIndex[i]]);
				result.add(item);
			}
			if(!incr(order))
				break;
			
		}
		return result;
		
		
    }
}
