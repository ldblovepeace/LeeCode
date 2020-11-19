package Questions.Q500;

import java.util.ArrayList;
import java.util.List;

public class Q442 {
	 public List<Integer> findDuplicates(int[] nums) {
//		 与448题类似
	        List<Integer> res = new ArrayList<>();
	        
	        for(int i = 0; i < nums.length; i++){
	            if(nums[Math.abs(nums[i])-1] < 0){
	                res.add(Math.abs(nums[i]));
	            }
	            else{
	                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
	            }
	        }

	        return res;
	    }
}
