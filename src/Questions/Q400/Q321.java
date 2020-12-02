package Questions.Q400;

import java.util.Arrays;
import java.util.Comparator;

public class Q321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];

        int m = nums1.length-1;
        int n = nums2.length-1;
        
        int max = 0;
        for(int i = 0; i< m && i<k; i++) {
            int maxInt1 = maxInt(nums1,i);
            int maxInt2 = maxInt(nums2, k-i);
            int result = (int) (maxInt1*Math.pow(10,k-i)+maxInt2);
            if(result>max) {
                max = result;
            }
        }
        for(int i = 0; i< n && i<k; i++) {
            int maxInt1 = maxInt(nums1,i);
            int maxInt2 = maxInt(nums2, k-i);
            int result = (int) (maxInt1*Math.pow(10,k-i)+maxInt2);
            if(result>max) {
                max = result;
            }
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
