package Questions.Q200;

import java.util.Arrays;

public class Q135 {
    public int candy(int[] ratings) {
        int res = 0;
        int filled = 0;
        int n = ratings.length;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        
        int record[] = new int[n];
        
        while(filled < n) {
            for(int i=0; i<n; i++) {
                if(record[i] == 0) {
//                    处理没有给定值的位置
                    if(i == 0) {
//                        处理开头
                        if(ratings[i+1] >= ratings[i]) {
                            record[i] = 1;
                            filled++;
                        }
                        if(ratings[i+1] < ratings[i] && record[i+1] != 0) {
                            record[i] = record[i+1] + 1;
                            filled ++;
                        }
                        continue;
                    }
                    
                    if(i == n-1) {
//                        处理结尾
                        if(ratings[i-1] >= ratings[i]) {
                            record[i] = 1;
                            filled++;
                        }
                        if(ratings[i-1] < ratings[i] && record[i-1] != 0) {
                            record[i] = record[i-1] + 1;
                            filled ++;
                        }
                        continue;
                    }
//                    处理中间位置
                    if(ratings[i] <= ratings[i-1] && ratings[i] <= ratings[i+1]) {
//                        如果当前位置比两边评分小，直接赋值1
                        record[i] = 1;
                        filled ++;
                        continue;
                    }
                    if(ratings[i] > ratings[i-1] && record[i-1] != 0) {
//                        如果当前位置比前一位置大，且前一位置已经确定值
                        if(ratings[i] > ratings[i+1] && record[i+1] != 0) {
//                            如果当前位置比后一位置大，后一位置值确定，取前后两个位置值更大的+1
                            record[i] = Math.max(record[i-1] + 1, record[i+1] + 1);
                            filled++;
                        }
                        if(ratings[i] <= ratings[i+1]) {
//                            如果当前位置比后一位置小，当前位置直接赋值前1位置值+1
                            record[i] = record[i-1] + 1;
                            filled++;
                        }
                        continue;
                    }
                    if(ratings[i] > ratings[i+1] && record[i+1] != 0) {
//                        如果当前位置比后一位置大，且后一位置值确定
                        if(ratings[i] > ratings[i-1] && record[i-1] != 0) {
//                            如果当前位置比前一位置大，前一位置确定，取前后两个位置值更大的+1
                            record[i] =  Math.max(record[i-1] + 1, record[i+1] + 1);
                            filled++;
                        }
                        if(ratings[i] <= ratings[i-1]){
//                            如果当前位置比前一位置小，当前位置直接赋值后1位置值+1
                            record[i] = record[i+1] + 1;
                            filled++;
                        }
                        continue;
                    }
                }
            }
        }
        for(int i=0; i<n; i++) {
            res += record[i];
        }
        
        return res;
    }
    

    public int candy1(int[] ratings) {
        int res = 0;
        int n = ratings.length;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        
        int record[] = new int[n];
        Arrays.fill(record, 1);
        for(int i=0; i<n-1; i++) {
            if(ratings[i+1] > ratings[i]) {
                record[i+1] = record[i] + 1;
            }
        }
        for(int i=n-1; i>0; i--) {
            if(ratings[i-1] > ratings[i] && record[i-1] <= record[i]) {
                record[i-1] = record[i] + 1;
            }
        }
        for(int i=0; i<n; i++) {
            res += record[i];
        }
        
        return res;
    }
    
    public int candy2(int[] ratings) {
        if(ratings == null || ratings.length == 0){
            return 0;
        }
        int[] nums = new int[ratings.length];//记录每一位孩子得到的糖果数
        nums[0] = 1;
        //先正序遍历，如果后一位比前一位高分，就给比前一位多1的糖果，否则给1
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                nums[i] = nums[i-1] + 1;        
            }else {
                nums[i] = 1;
            }
        }
        //在倒叙遍历，如果前一位比后一位高分并且得到的糖果小于或等于后一位，就给前一位孩子比后一位孩子多一个糖果
        for(int i = ratings.length -2 ; i >= 0; i--){
            if(ratings[i] > ratings[i+1] && nums[i] <= nums[i+1]){
                nums[i] = nums[i+1] +1;
            }
        }
        int count = 0;
        for(int i : nums){
            count +=i;
        }
        return count;
    }
}
 