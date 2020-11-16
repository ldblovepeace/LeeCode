package Questions;

import java.util.Arrays;

public class Q628 {
	public int maximumProduct(int[] nums) {
		fastSort(nums,0,nums.length-1);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
	
	public void fastSort(int[] nums, int front, int rear) {
		if(front < rear) {
			int index = findIndex(nums, front, rear);
			fastSort(nums,front,index);
			fastSort(nums,index+1,rear);
		}
	}
	
	public int findIndex(int[] nums, int front, int rear) {
		int key = nums[front];
		while(front!=rear) {
			if(nums[rear] < key) {
				int tmp = nums[front];
				nums[front] = nums[rear];
				nums[rear] = tmp;
				while(front!=rear) {
					if(nums[front] > key) {
						tmp = nums[front];
						nums[front] = nums[rear];
						nums[rear] = tmp;
						break;
					}else {
						front ++;
					}
				}
			}else {
				rear--;
			}
		}
		return front;
	}
}
