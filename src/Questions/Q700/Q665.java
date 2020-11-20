package Questions.Q700;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q665 {
    public boolean checkPossibility(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            l1.add(nums[i]);
            l2.add(nums[i]);
        }
        
        for(int i = 0; i<n-1;i++ ){
            if(nums[i] > nums[i+1]){
                l1.remove(i);
                l2.remove(i+1);
                break;
            }
        }

        for(int i=0; i< l1.size()-1; i++){
            if(l1.get(i) > l1.get(i+1)){
                for(int j=0; j < l2.size()-1;j++){
                    if(l2.get(j) > l2.get(j+1)){
                        return false;
                    }
                }
                return true;
            }
        }

        return true;
    }

    public boolean checkPossibility2(int[] nums) {
//    	比较n+1和n-1的大小
    	
    	int n = nums.length;
    	
    	for(int i = 0; i < n-1; i++) {
    		if(nums[i] > nums[i+1]) {
    			if(i == 0) {
    				nums[i] = nums[i+1];
    				break;
    			}
    			if(i == n-2) {
    				nums[i+1] = nums[i];
    				break;
    			}
    			if(nums[i-1] <= nums[i+1]) {
    				nums[i] = nums[i+1];
    				break;
    			}
    			if(nums[i-1] > nums[i+1]) {
    				nums[i+1] = nums[i];
    				break;
    			}
    		}
    	}
    	
    	for(int i = 0; i < n-1; i++) {
    		if(nums[i] > nums[i+1]) {
    			return false;
    		}
    	}
    	
        return true;
    }

    
}