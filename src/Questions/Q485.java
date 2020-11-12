package Questions;

public class Q485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            while(i< nums.length && nums[i] == 1){
                count ++;
                ++i;
            }
            if(result < count){
                result = count;
            }
            count = 0;
        }

        return result;
    }
}
