package Questions.Q300;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Q274 {
	public int hIndex(int[] citations) {
		Integer[] tmp = new Integer[citations.length];
		for(int i=0; i<citations.length; i++) {
			tmp[i] = citations[i];
		}
		
        // 倒序排列
		Arrays.sort(tmp,Collections.reverseOrder());
		
		int res = 0;
		
		for(int i = 0; i< tmp.length; i++) {
			if(tmp[i] > res) {
				res++;
			}
            if(tmp[i] <= res){
                return res;
            }
		}
		
		return res;
    }
	
	public int hIndex2(int[] citations) {
		Integer[] tmp = new Integer[citations.length];
		for(int i=0; i<citations.length; i++) {
			tmp[i] = citations[i];
		}
		
        // 倒序排列
//		Arrays.sort(tmp,new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2-o1;
//			}
//			
//		});
		
		Arrays.sort(tmp,(a,b)->b-a);
		
		
		int res = 0;
		
		for(int i = 0; i< tmp.length; i++) {
			if(tmp[i] > res) {
				res++;
			}
            if(tmp[i] <= res){
                return res;
            }
		}
		
		return res;
    }
	
	public int hIndex3(int[] citations) {
		int res = 0;
		Arrays.sort(citations);
		
		for(int i = citations.length-1; i>=0; i--) {
			if(citations[i] > res) {
				res++;
			}
            if(citations[i] <= res){
                return res;
            }
		}
		
		return res;
    }

		
}
