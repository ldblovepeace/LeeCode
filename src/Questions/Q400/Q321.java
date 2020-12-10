package Questions.Q400;

import java.util.Arrays;
import java.util.Comparator;

public class Q321 {
// 官方题解

public int[] maxNumber1(int[] nums1, int[] nums2, int k) {
    int m = nums1.length, n = nums2.length;
    int[] maxSubsequence = new int[k];
    int start = Math.max(0, k - n), end = Math.min(k, m);
    for (int i = start; i <= end; i++) {
        int[] subsequence1 = maxSubsequence(nums1, i);
        int[] subsequence2 = maxSubsequence(nums2, k - i);
        int[] curMaxSubsequence = merge(subsequence1, subsequence2);
        if (compare(curMaxSubsequence, 0, maxSubsequence, 0) > 0) {
            System.arraycopy(curMaxSubsequence, 0, maxSubsequence, 0, k);
        }
    }
    return maxSubsequence;
}

public int[] maxSubsequence(int[] nums, int k) {
    int length = nums.length;
    int[] stack = new int[k];
    int top = -1;
    int remain = length - k;
    for (int i = 0; i < length; i++) {
        int num = nums[i];
        while (top >= 0 && stack[top] < num && remain > 0) {
            top--;
            remain--;
        }
        if (top < k - 1) {
            stack[++top] = num;
        } else {
            remain--;
        }
    }
    return stack;
}

public int[] merge(int[] subsequence1, int[] subsequence2) {
    int x = subsequence1.length, y = subsequence2.length;
    if (x == 0) {
        return subsequence2;
    }
    if (y == 0) {
        return subsequence1;
    }
    int mergeLength = x + y;
    int[] merged = new int[mergeLength];
    int index1 = 0, index2 = 0;
    for (int i = 0; i < mergeLength; i++) {
        if (compare(subsequence1, index1, subsequence2, index2) > 0) {
            merged[i] = subsequence1[index1++];
        } else {
            merged[i] = subsequence2[index2++];
        }
    }
    return merged;
}

public int compare(int[] subsequence1, int index1, int[] subsequence2, int index2) {
    int x = subsequence1.length, y = subsequence2.length;
    while (index1 < x && index2 < y) {
        int difference = subsequence1[index1] - subsequence2[index2];
        if (difference != 0) {
            return difference;
        }
        index1++;
        index2++;
    }
    return (x - index1) - (y - index2);
}
    // 
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];

        int m = nums1.length-1;
        int n = nums2.length-1;
        
        int max = 0;
        for(int i = 0; i< m && i<k; i++) {
            if(k-i>n){
                continue;
            }
            int maxInt1 = maxInt(nums1,i);
            int maxInt2 = maxInt(nums2, k-i);
            int result = (int) (maxInt1*Math.pow(10,k-i)+maxInt2);
            if(result>max) {
                max = result;
            }
        }
        for(int i = 0; i< m && i<k; i++) {
            if(k-i>m){
                continue;
            }
            int maxInt1 = maxInt(nums1,k-i);
            int maxInt2 = maxInt(nums2,i);
            int result = (int) (maxInt2*Math.pow(10,k-i)+maxInt1);
            if(result>max) {
                max = result;
            }
        }
        
        for(int i = 0; i<k;i++){
            res[i] = (int) ((max / Math.pow(10, k - i-1)) % 10);
        }
        return res;
    }
    
    public int maxInt(int nums[], int k) {
        int result = 0;
//        返回自身数组中不改变顺序对应位最大数字的值
        int[] res = new int[k];
        int n = nums.length;
        Integer[][] record = new Integer[n][2];
        for(int i=0; i<n; i++) {
            record[i][0] = nums[i];
            record[i][1] = i;
        }
        Arrays.sort(record, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                // TODO Auto-generated method stub
                if(o1[0]-o2[0] != 0) {
                    return o2[0]-o1[0];
                }else {
                    return o2[1]-o1[1];
                }
                
            }
        });
        boolean find = false;
        int j = 0;
        for(int i=0; i<n; i++) {
            while(i< n && n-record[i][1] >= k && k>0) {
//                如果大数位置后比k长               
               res[j] = record[i][0];
               
               if(n-record[i][1] == k) {
                   k--;
                   j++;
                   i++;
                   find = true;
                   break;
               }
               k--;
               j++;
               i++;
            }
            if(find) {
                for(int ii = record[i-1][1]+1;k>0;ii++,j++,k--) {
                    res[j] = nums[ii];
                }
                break;
            }
        }
        for(int i = res.length-1; i>=0 ; i--) {
            result = (int) (result +Math.pow(10, (res.length-1-i))*res[i]);
        }
        return result;
    }
}
