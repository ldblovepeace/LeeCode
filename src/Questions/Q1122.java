package Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Q1122 {
	public int[] relativeSortArray1(int[] arr1, int[] arr2) {
//		
		Map<Integer, Integer> contain = new HashMap<>();
		int[] notContain = new int[arr1.length - arr2.length];
		int count = notContain.length;
		
		int[] result = arr1;
		for(int i = 0; i < arr2.length; i++) {
//			使用map记录arr2中出现的数字
			contain.put(arr2[i],0);
		}
		
		for(int i = 0; i < arr1.length; i++) {
			if(contain.containsKey(arr1[i])) {
//				遍历arr1，如果对应数字在arr2中出现
				int num = contain.get(arr1[i]);
				contain.put(arr1[i], num+1);
//				记录出现的次数
			}
			else {
//				如果没有在arr2中出现
				int q = 0;
				while(q<notContain.length && notContain[q] < arr1[i]) {
//					从后往前插入并排序
					q++;
				}
				for(int m = count; m<q;m++) {
					notContain[m-1] = notContain[m];
				}
				notContain[q-1] = arr1[i];
				count--;
			}
		}
		
		int num = 0;
//		num记录当前位置
		for(int i = 0;i<arr2.length ;i++) {
			int tmp = contain.get(arr2[i]);
			num = num+tmp;
			for(int j = num; tmp > 0; tmp --) {
				result[j-tmp] = arr2[i];
			}
				
		}
		
		
		for(int i = count; i < notContain.length; i ++) {
			result[num+i-count] = notContain[i];
		}
		
		return result;
    }
	
	
	public int[] relativeSortArray2(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		int[] numCount = new int[1001];
		int record = 0;
		for(int i = 0; i< arr1.length; i++) {
			numCount[arr1[i]] ++;
		}
		
		for(int i = 0; i<arr2.length; i++) {
			int num = numCount[arr2[i]];
			for(int j = record+num; j>record;j--) {
				result[j-1] = arr2[i];
				numCount[arr2[i]]--;
			}
			record = record + num;
		}
		
		for(int i = 0; i< numCount.length;i++) {
			int num = numCount[i];
			if(num != 0) {
				while(num>0) {
					result[record] = i;
					record ++;
					num --;
				}
			}
		}
		
		return result;
	}
}
