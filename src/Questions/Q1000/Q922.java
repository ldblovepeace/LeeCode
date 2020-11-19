package Questions.Q1000;

public class Q922 {
	 public int[] sortArrayByParityII(int[] A) {
	        int odd = 1; // 奇数指针
	        int even = 0;  // 偶数指针
	        int tmp;
	        while(even < A.length){ // 从第0个位置开始遍历
	            if(A[even]%2 == 1){ // 遇到数组坐标是偶数但数字是奇数的，去找坐标是奇数但值是偶数的数组字段
	                while(odd < A.length){
	                    if(A[odd] % 2 != 1){ // 找到后交换
	                        tmp = A[odd];
	                        A[odd] = A[even];
	                        A[even] = tmp;
	                        break;
	                    }
	                    odd = odd + 2; // 记录奇数指针位置
	                }
	            }
	            even = even + 2; // 记录偶数指针位置
	        }
	        return A;
	    }
}
