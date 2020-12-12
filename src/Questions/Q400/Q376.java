package Questions.Q400;

public class Q376 {
    public int wiggleMaxLength(int[] nums) {

        int n = nums.length;
        if(n < 2) {
            return n;
        }
        int res = 1;
        int lastGap = 0;
        int former = nums[0];
        boolean find = false;
        for(int i=1; i<n; i++) {
            int nextGap = nums[i] - former;
            if(nextGap == 0) {
                continue;
            }else {
                if(former == nums[0] && !find) {
                    lastGap = nextGap;
                    res++;
                    former = nums[i];
                    find = true;
                    continue;
                }else {
                    if(lastGap > 0 && nextGap > 0) {
                        former = (nums[i] > former)? nums[i]:former;
                        continue;
                    }
                    if(lastGap < 0 && nextGap < 0) {
                        former = (nums[i] < former)? nums[i]:former;
                        continue;
                    }
                    if((lastGap < 0 && nextGap > 0) || (lastGap > 0 && nextGap < 0)) {
                        res++;
                        former = nums[i];
                        lastGap = nextGap;
                    }
                }
            }
        }        
        return res;
    }
}
