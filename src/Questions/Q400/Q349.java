package Questions.Q400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q349 {
	public int[] intersection(int[] nums1, int[] nums2) {
//		两个hashset解决
		Set<Integer> n = new HashSet<>();
		for(int i = 0; i<nums1.length; i++) {
			if(!n.contains(nums1[i])) {
				n.add(nums1[i]);
			}
		}
		
		Set<Integer> result = new HashSet<>();
		for(int j = 0; j<nums2.length; j++) {
			if(n.contains(nums2[j])) {
				if(!result.contains(nums2[j])) {
					result.add(nums2[j]);
				}
			}
		}
		
//	    使用iterator循环
		Iterator<Integer> itor = result.iterator();
		int[] r = new int[result.size()];
		int i = 0;
		while(itor.hasNext()) {
			r[i] = itor.next();
			i++;
		}
		
		return r;
    }
}
