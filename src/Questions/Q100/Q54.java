package Questions.Q100;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public List<Integer> rotate(int[][] nums){
        List<Integer> res = new ArrayList<>();
        int up = 0;
        int down = nums.length-1;
        int left = 0;
        int right = nums[0].length-1;
        
        boolean isUp = true;
        boolean isRight  =true;
        
        while(up<=down) {
            while(left<=right) {
                if(isUp) {
                    for(int i = left; i<= right;i++) {
                        res.add(nums[up][i]);
                    }
                    up++;
                    isUp = false;
                    break;
                }
                else {
                    for(int i = right; i >= 0; i++) {
                        res.add(nums[down][i]);
                        down --;
                        isUp = true;
                        break;
                    }
                }
                
            }
            while(up<=down) {
                if(isRight) {
                    for(int i = up; i<=down; i++) {
                        res.add(nums[right][i]);
                    }
                    right --;
                    isRight = false;
                    continue;
                }
                else {
                    for(int i = down; i>=up; i--) {
                        res.add(nums[left][i]);
                    }
                    left++;
                    isRight = true;
                    continue;
                }
            }
        }
        
        return res;
    }
}
