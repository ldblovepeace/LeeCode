package Questions.Q100;

public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[] {-1,-1};
        if(n==0 || nums[n-1] < target || nums[0] > target) {
            return res;
        }
        
        int front = 0;
        int rear = n;
        int left = 0;
        while(front <= rear) {
            left = (int) Math.floor((front+rear)/2);
            if(nums[left] == target) {
                break;
            }
            while(nums[left] < target) {
                front = left+1;
                break;
            }
            while(nums[left] > target) {
                rear = left-1;
                break;
            }
        }
        if(nums[left] != target) {
            return res;
        }
        
        int right = left;
        while(left!=0 && nums[left-1] == target){
            left = left-1;
        }
        while(right!=n-1 && nums[right+1] == target){
            right = right+1;
        }
        res[0] = left;
        res[1] = right;
        return res;
    }
    
    
    public int[] searchRange1(int[] nums, int target) {
        int n = nums.length;
        int front = 0;
        int rear = n-1;
        if(n==0 || nums[n-1] < target || nums[0] > target) {
            return new int[] {-1,-1};
        }
        for(int i = 0; i<n; i++) {
            if(nums[i] == target) {
                front = i;
                break;
            }
        }
        for(int j = n-1; j>=0; j--) {
            if(nums[j] == target) {
                rear = j;
                break;
            }
        }
        
        
        if(nums[front] != target || nums[rear] != target) {
            return new int[] {-1,-1};
        }else {
            return new int[] {front,rear};
        }
    }
}
