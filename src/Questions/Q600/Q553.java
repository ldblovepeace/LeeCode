package Questions.Q600;

public class Q553 {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        String res = "";
        if(n==1) {
            return String.valueOf(nums[0]);
        }
        else if(n==2) {
            return String.valueOf(nums[0]) + "/" + String.valueOf(nums[1]);
        }else {
            for(int i=0; i<n; i++) {
                if(i==0) {
                    res = res + String.valueOf(nums[i]) +  "/(";
                }else {
                    if(i==n-1) {
                        res = res + String.valueOf(nums[i]) + ")";
                    }else {
                        res = res + String.valueOf(nums[i]) + "/" ;
                    }
                }
            }
        }
        return res;
    }
}
