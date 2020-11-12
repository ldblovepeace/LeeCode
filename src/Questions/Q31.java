package Questions;
//unfinished
public class Q31 {
	public void nextPermutation(int[] nums) {
		int index = nums.length-1;
		int min = nums[index];
		boolean change = false;
		for(int i = index; i > 0; i--) {
			if(nums[i] > nums[i-1] && i > 1) {
				min = nums[i-1];
				nums[i-1] = nums[i];
				nums[i] = min;
				change = true;
				break;
			}
			if(nums[i] > nums[i-1] && i == 1) {
				if(nums[0] == min) {
					min = nums[i-1];
					nums[i-1] = nums[i];
					nums[i] = min;
					change = true;
					break;
				}
				if(nums[0] < min) {
					int[] tmp = new int[index];
					for(int j = 0; j< index; j++) {
						tmp[j] = nums[j];
					}
					Q1365 q = new Q1365();
					q.quickSort(tmp, 0, index-1);
					nums[0] = min;
					for(int j = 1; j<= index; j++) {
						nums[j] = tmp[j-1];
					}
					change = true;
				}
			}
		}
		if(!change) {
			reverse(nums);
		}
    }
	
	public void reverse(int[] nums) {
		int front = 0;
		int rear = nums.length-1;
		int temp;
		while(front < rear) {
			temp = nums[front];
			nums[front] = nums[rear];
			nums[rear] = temp;
			front ++;
			rear --;
		}
	}
	
}
