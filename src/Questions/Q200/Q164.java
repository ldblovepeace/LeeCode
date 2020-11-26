package Questions.Q200;

import java.util.Arrays;

public class Q164 {
    public int maximumGap1(int[] nums) {
        if(nums.length <= 1) {
            return 0;
        }
        
        int res = 0;
        int max = nums[0];
        int min = nums[0];
        int n = nums.length;
        
        for(int i = 0; i< n; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
        }
                
        int avgGap = Math.max(1, (max - min)/(n-1));
        //避免出现d为0的情况，没有bucketLength
        int bucketLength = 1 + (max-min)/avgGap;
        int[][] bucket = new int[bucketLength][2];
//      只存储最大值和最小值
        
        for(int i = 0; i<bucketLength; i++) {
            Arrays.fill(bucket[i],-1);
        }
        
        for(int i = 0; i<n;i++) {
            int location = (nums[i]-min)/avgGap;
            if(bucket[location][0] == -1) {
                bucket[location][0] = nums[i];
            }
            if(nums[i] < bucket[location][0]) {
                bucket[location][0] = nums[i];
            }
            if(nums[i] > bucket[location][1]) {
                bucket[location][1] = nums[i];
            }
        }
        
        
        int prevMax = 0;
        for(int i = 0; i<bucketLength-1; i++) {
            if(bucket[i][1] == -1) {
                if(bucket[i][0] != -1) {
                    prevMax = bucket[i][0];
                }
            }
            if(bucket[i][1] != -1) {
                prevMax = bucket[i][1];
            }
            
            if(bucket[i+1][0] != -1) {
                int tmpMax = bucket[i+1][0] - prevMax;
                res = tmpMax>res? tmpMax:res;
            }
            
        }
        
        return res;
    }
    
    public int maximumGap2(int[] nums) {
        int res = 0;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i+1] - nums[i] > res) {
                res = nums[i+1] - nums[i];
            }
        }
        
        return res;
    }
}
