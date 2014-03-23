package name.loveni.oj.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

	public ArrayList<String> anagrams(String[] strs) {
		
		ArrayList<String> result=new ArrayList<String> ();
		if(strs==null||strs.length==0)
			return result;
		
		HashMap<String, ArrayList<String>> group =new HashMap<String, ArrayList<String>>();
		
		for(String str:strs) {
			char [] keyArr=str.toCharArray();
			Arrays.sort(keyArr);
			String key=String.valueOf(keyArr);
			if(group.containsKey(key)) {
				group.get(key).add(str);
			}
			else {
				ArrayList<String> list=new ArrayList<String>();
				list.add(str);
				group.put(key,list);
			}
		}
		
		for(String key:group.keySet()) {
			ArrayList<String> l=group.get(key);
			if(l.size()>1)
				result.addAll(l);
		}
		return result;
		
		
    }
}
