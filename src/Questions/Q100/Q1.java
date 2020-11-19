package Questions.Q100;

import java.util.HashMap;

public class Q1 {
	 public int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        // �����ⷨ
	        // for(int i=0;i<nums.length;i++){
	        //     for(int j=i+1;j<nums.length;j++){
	        //         if(target-nums[i]==nums[j]){
	        //             result[0]=i;
	        //             result[1]=j;
	        //             return result;
	        //         } else continue;
	        //     }
	        // }
	        // return null;
	        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
	        for (int i=0;i<nums.length;i++){
	            if(mp.containsKey(nums[i])){
	                result[0] = mp.get(nums[i]);
	                result[1] = i;
	                return result;
	            }
	            mp.put(target-nums[i],i);
	        }
	        return null;
	    }
}

