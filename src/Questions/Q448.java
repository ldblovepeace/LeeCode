package Questions;

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
}
