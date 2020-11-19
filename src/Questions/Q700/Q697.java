package Questions.Q700;

import java.util.HashMap;

public class Q697 {
	 public int findShortestSubArray(int[] nums) {
	        int [][] record= new int[50001][3];
	        // 新建数组用来记录度，度起始值，度结束值

	        for(int i = 0; i< nums.length; i++){
	            record[nums[i]][0] ++;
	            // 记录对应数字的度
	            if(record[nums[i]][1] == 0 && nums[i] != nums[0]){
	                record[nums[i]][1] = i;
	            //记录度起始
	            } 
	            if(record[nums[i]][2] < i){
	                record[nums[i]][2] = i;
	                //记录度结束
	            }
	        }

	        int[] result = new int[3];
	        for(int i = 0; i< record.length; i++){
	            if(record[i][0] > result[0]){
	                result[0] = record[i][0];
	                result[1] = record[i][1];
	                result[2] = record[i][2];
	            }
	            if(record[i][0] == result[0]){
	            	if(record[i][2] - record[i][1] +1 < result[2]-result[1]+1) {
	            		result[0] = record[i][0];
		                result[1] = record[i][1];
		                result[2] = record[i][2];
	            	}
	            }
	        }

	        return result[2]-result[1]+1;
	    }
	 
	 
}
