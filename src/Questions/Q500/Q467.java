package Questions.Q500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q467 {

    public int findSubstringInWraproundString(String p) {
        int len = p.length();
        if (len == 0)
            return 0;
        int[] map = new int[26];
        int dp = 0;
        int sum = 0;
        char[] arr = p.toCharArray();
        for (int i = 0; i < len; i++) {
            char c = arr[i];
            if (i == 0 || (c - arr[i - 1] - 1) % 26 == 0) {
                dp++;
            } else
                dp = 1;
            int cnt = map[c - 'a'];
            if (dp > cnt) {
                sum += dp - cnt;
                map[c - 'a'] = dp;
            }
        }
        return sum;
    }

    public int findSubstringInWraproundString1(String p) {
        int res = 0;
        char[] c = p.toCharArray();
        int n = p.length();
        List<Integer> l = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < n - 1; i++) {
            if (c[i + 1] - c[i] == 1 || (c[i + 1] == 'a' && c[i] == 'z')) {
                length++;
            } else {
                l.add(length + 1);
                length = 0;
            }
        }
        if (length != 0) {
            l.add(length + 1);
        }

        for (int i : l) {
            while (i > 0) {
                res = res + i;
                i--;
            }
        }

        return res;
    }

    public int findSubstringInWraproundString2(String p) {
        char[] c = p.toCharArray();
        int n = p.length();
        if(n == 0) {
            return 0;
        }
        int[] charLength = new int[26];
        int length = 1;
        int res = 0;
        charLength[c[0] - 'a'] = length;
        for (int i = 1; i < n; i++) {
//          记录p的分段数据，按结尾的字符存储最长的记录
//          字符串间有两种情况，1种被包含，1种有交叉（包含也可以看成是另外一种交叉）
//          被包含的直接舍弃
//          交叉的减去交叉字符的结果
//          实际上在记录分段长度的时候可以将包含和交叉一起处理掉
            if (c[i] - c[i - 1] == 1 || (c[i] == 'a' && c[i - 1] == 'z')) {
                length++;
            } else {
                length = 1;
            }
            
            res = res + length;//先加当前长度
            // 再减去当前长度和之前存储长度较小的一个
            res = res - ((charLength[c[i] - 'a'] <= length) ? charLength[c[i] - 'a'] : length);
            // 将当前位置的长度存储为较长的一个 
            charLength[c[i] - 'a'] = ((charLength[c[i] - 'a'] < length) ? length : charLength[c[i] - 'a']);

        }

        return res;
    }

}
