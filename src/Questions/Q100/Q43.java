package Questions.Q100;

import java.util.ArrayList;
import java.util.List;

public class Q43 {
    public String multiply(String num1, String num2) {
        
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        List<List<Integer>> l = new ArrayList<>();
        char[] nums1 = num1.toCharArray();
        char[] nums2 = num2.toCharArray();
        int n1 = num1.length();
        int n2 = num2.length();
//        结果数组 n1是结果的行，n2是结果的列
        int[][] record = new int[n1][n2];
        for(int i=n1-1; i>=0; i--) {
            for(int j=n2-1; j>=0; j--) {
                record[i][j] = (nums2[j] - '0') * (nums1[i]-'0');
            }
        }
        
        for(int i=0; i<n1; i++) {
//            从小到大，处理每一位的乘法结果
            List<Integer> lineResult = new ArrayList<>();
            
            for(int j=n2-1; j>0; j--) {
                record[i][j-1] += record[i][j] / 10;
                record[i][j] %= 10;
            }
            if(record[i][0] >= 10) {
                lineResult.add(record[i][0]/10);
                record[i][0] %= 10; 
            }
            for(int j=0; j<n2; j++) {
                lineResult.add(record[i][j]);
            }
            
            int k = n1-i-1;
            while(k>0) {
//                按乘法规则，十分位乘法要左移一个0，类推
                lineResult.add(0);
                k--;
            }
            l.add(lineResult);
//          lineResult的排列规则是从个位数乘法到十位数乘法，从小到大
        }
        
        int n = l.get(0).size();
//        第一一个的长度最大
        int[] result = new int[n];
        for(List<Integer> l1:l) {
            for(int i=n-1; i>=0; i--) {
                if(n-i <= l1.size()) {
                    result[i] += l1.get(l1.size() - n + i);
                }
            }
        }
        
        for(int i= n-1; i>0; i--) {
            result[i-1] += result[i]/10;
            result[i] %= 10;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
