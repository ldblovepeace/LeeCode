package Questions;

import java.util.HashMap;
import java.util.Set;

public class Q1207 {
	public boolean uniqueOccurrences1(int[] arr) {
//		使用2000的数组作为arr数字重复的记录
		int[] result = new int[2000];
		for(int i=0; i < arr.length; i ++) {
			result[arr[i]+1000] = result[arr[i]+1000]+1;
		}
//		判断arr计数里有没有重复字段
//		暴力解法，两次遍历
		for(int i=0; i<result.length; i++) {
			if(result[i] == 0) {
				continue;
				}
			int j = i;
			while(j<result.length) {
				if(result[j] == 0||j==i) {
					j++;
					continue;
				}
				if(result[j] == result[i]) {
					return false;
				}
				j++;
			}
		}
		return true;
    }
	
	public boolean uniqueOccurrences2(int[] arr) {
//		使用hashmap作为arr数字重复的记录
		HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
		for(int i = 0; i< arr.length; i ++) {
			if(result.containsKey(arr[i])) {
				int temp = result.get(arr[i]);
				result.put(arr[i], temp+1);
			}else {
				result.put(arr[i],1);
			}
		}
//		判断hashmap里有没有重复value
		HashMap<Integer,Integer> t = new HashMap<Integer,Integer>();
		for(Integer key : result.keySet()) {
			if(t.containsKey(result.get(key))) {
				return false;
			}
			t.put(result.get(key), key);
		}
		return true;
    }
}
