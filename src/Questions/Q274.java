package Questions;

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
		
		for(int i = 0; i< tmp.length; i++) {
            // 两种类型，第一种是数组内有引用较少的
			if(tmp[i] < i+1) {
				return i;
			}
            // 第二种，数组内没有引用较少的
            if(tmp[i] >= i+1 && i == tmp.length -1){
                return tmp.length;
            }
		}
		
		return 0;
    }
	
	
}
