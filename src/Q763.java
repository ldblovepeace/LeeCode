import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q763 {
	public List<Integer> partitionLabels(String S) {
		List<Integer> l = new ArrayList<Integer>();
		int[] endNum = endNum(S);
		
		for(int i=0; i < S.length(); i++) {
			int end = endNum[S.charAt(i)-'a'];
//				从字符开始到字符结束，找到中间char的最后结束最大的值
				for(int j = 0; j < end; j++) {
					if(endNum[S.charAt(j)-'a'] > end) {
						end = endNum[S.charAt(j)-'a'];
					}
				}
				l.add(end-i+1);
				i = end;
			}
		
		return l;
    }
	
	public List<Integer> partitionLabels1(String S) {
		List<Integer> l = new ArrayList<Integer>();
		HashMap<Character,Integer> charStart = charStart(S);
		HashMap<Character,Integer> charEnd = charEnd(S);
		
		for(int i=0; i < S.length(); i++) {
			int start = charStart.get(S.charAt(i));
			int end = charEnd.get(S.charAt(i));
			
//				从字符开始到字符结束，找到中间char的最后结束最大的值
				for(int j = 0; j < end; j++) {
					if(charEnd.get(S.charAt(j)) > end) {
						end = charEnd.get(S.charAt(j));
					}
				}
				l.add(end-start+1);
				i = end;
			}
		
		return l;
    }

//	public HashMap<Character,Integer> stringCharNum(String S){
//		HashMap<Character,Integer> mp = new HashMap<>();
//		for(int i =0;i<S.length();i++) {
//			if(mp.containsKey(S.charAt(i))) {
//				mp.put(S.charAt(i), mp.get(S.charAt(i))+1);
//			}
//			else {
//				mp.put(S.charAt(i), 1);
//			}
//		}
//		return mp;
//	}
	
	public HashMap<Character,Integer> charStart(String S){
		HashMap<Character,Integer> mp = new HashMap<>();
		for(int i =0;i<S.length();i++) {
			if(!mp.containsKey(S.charAt(i))) {
				mp.put(S.charAt(i), i);
			}
		}
		return mp;
	}
	
	public HashMap<Character,Integer> charEnd(String S){
		HashMap<Character,Integer> mp = new HashMap<>();
		for(int i = S.length()-1 ;i>=0;i--) {
			if(!mp.containsKey(S.charAt(i))) {
				mp.put(S.charAt(i), i);
			}
		}
		return mp;
	}
	
	public int[] endNum(String S) {
		int[] result = new int[26];
		for(int i = 0 ; i<S.length() ;i++) {
			result[S.charAt(i)-'a'] = i;
		}
		return result;
	}
	
//	public boolean ContainsHashMap(HashMap<Character,Integer> string, HashMap<Character,Integer> subStr) {
//		for(int key:subStr.keySet()) {
//			if(subStr.get(key) != string.get(key)){
//			return false;
//			}
//		}
//		return true;
//	}
}
