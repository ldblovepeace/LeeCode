package Questions.Q500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> record = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            record.put(nums[i],0);
        }

        for(int i = 1; i < nums.length+1; i++ ){
            if(!record.containsKey(i)){
                l.add(i);
            }
        }

        return l;
    }
	
	public List<Integer> findDisappearedNumbers2(int[] nums) {
//		数组下标对应位置置负
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i< nums.length; i++) {
        	nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for(int i=0; i < nums.length; i++) {
        	if(nums[i] > 0) {
        		l.add(i+1);
        	}
        }

        return l;
    }
}
