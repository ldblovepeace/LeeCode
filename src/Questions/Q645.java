package Questions;

public class Q645 {
	public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] record = new int[n+1];
        int[] result = new int[2];
        for(int num : nums){
            record[num] = record[num] +1;
        }
        for(int i = 1;i<record.length;i++){
            if(record[i] == 0){
                result[1] = i;
            }
            if(record[i] == 2){
                result[0] = i;
            }
        }
        return result;
    }
}
