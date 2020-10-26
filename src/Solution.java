
public class Solution {
	public boolean isLongPressedName(String name, String typed) {
        // 设置指针记录typed字符串的位置
        int t = 0;
        for(int i=0;i<name.length();i++){
            // 遍历name字符串，与typed比较
            if(name.charAt(i) != typed.charAt(t)){
                // 如果字符不相等，typed字符与前一个比较是否相等，相等通过，否则返回false
                if(t==0 || t >= typed.length()){
                    // 如果第一个字符就不相等返回false，避免内存溢出
                    return false;
                    }
                else if(typed.charAt(t) != typed.charAt(t-1)){
                    // 如果typed字符与前一个字符不符，返回false
                    return false;
                }
                else if(typed.charAt(t) == typed.charAt(t-1)){
                    // 如果typed字符与前一个相同，找到第一个不重复的字符进行比较
                    while(typed.charAt(t) == typed.charAt(t-1)){
                        t=t+1;
                    }
                    if(typed.charAt(t)!=name.charAt(i)){
                        return false;
                    }
                    if(typed.charAt(t)==name.charAt(i)) {
                    	t=t+1;
                    }
                } 
            } else{
                // 字符串相等，继续遍历
                t=t+1;
            }
        }
        // 遍历完name字符串后避免typed有更多内容，确认后续字符与name最后一个字符相同
        while(t < typed.length()){
            if(typed.charAt(t)!=typed.charAt(t-1)){
                return false;
            }
            t++;
        }
        return true;
    }
}
