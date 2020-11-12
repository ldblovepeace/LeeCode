package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q514 {
	//定义dp[i][j]表示从前往后拼写出key的第 i个字符.ring的第j个字符与12:00对齐最少步数
    public int findRotateSteps1(String ring, String key) {
        int len=key.length();
        int rLen=ring.length();
        int[][] dp=new int[len+1][rLen+1];

        //假设所有位置都是不可能,所有dp初始化为一个不可能的最大值
        for(int i=0;i<=len;i++){
            for(int j=0;j<=rLen;j++){
                dp[i][j]=123456;
            }
        }
        //边界条件
        for(int i=0;i<rLen;i++){
            if(key.charAt(0)==ring.charAt(i)){
                dp[1][i+1]=Math.min(i,rLen-i);
            }
        }
        
        //第几个
        for(int i=2;i<=len;i++){
            //第几个
            for(int j=1;j<=rLen;j++){
                if(ring.charAt(j-1)==key.charAt(i-1)){
                    char last=key.charAt(i-2);
                    List<Integer> pos=new ArrayList<Integer>();
                    //k为下标，加1为位置
                    for(int k=0;k<rLen;k++){
                        if(last==ring.charAt(k))pos.add(k);
                    }
                    for(int p=0;p<pos.size();p++){
                        int tmp=pos.get(p);//索引
                        int dis=Math.abs(tmp+1-j);
                        dp[i][j]=Math.min(dp[i][j],dp[i-1][tmp+1]+Math.min(dis,rLen-dis));
                    }
                }
            }
        }
        //达到key的最后一个，且步数最小的那个
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=rLen;i++){
            res=Math.min(res,dp[len][i]);
        }
        return res+len;//拼写len步
    }
	
	
//	unfinished
	public int findRotateSteps2(String ring, String key) {
		List<Integer> road = new ArrayList<>();
		int location = 0;
		int index = 0;
		int result = 0;
		while(road.size() < key.length()) {
			Character next = null;
			int[] r = new int[2];
			if(index != key.length() -1) {
				r = nearByChar(ring, location , key, index);
			}
			if(index == key.length() -1) {
				r = nearByChar(ring, location , key.charAt(index));
			}
			location = r[1];
			road.add(r[0]);
			index ++;
		}
		
		for(int i = 0; i<road.size(); i++) {
			result = result + Math.abs(road.get(i));
		}
		
		return result+key.length();
    }
	
	public int[] nearByChar(String s, int location, String key, int index) {
//		字符串S当前位置num距离c的目标距离，得到结果列表
		int[] result = new int[2];
		result[0] = s.length();
		result [1] = location;
		int distance;
		int nextDistance = s.length();
		Character c = key.charAt(index);

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
//				判断是否距离更近，负数代表左旋，正数代表右旋
//				数组第一位代表步数，第二位代表当前位置
				distance = Math.abs(i - location);
				if(result[0] != s.length()) {
					if(index!=key.length()-1) {
						index ++;
						nextDistance = nearByChar(s,result[1],key,index)[0]; 
					}
				} 
				if(s.length() - distance < distance) {
//					若反向距离更近则取反向距离
					distance = s.length() - distance;
				}

//				如果距离相等，要判断下一个字符的路径！！！
				if(distance == result[0]) {
					if(nearByChar(s,i,key,index)[0] < nextDistance) {
//						考虑下一个字符的路径更短
						result[0] = distance;
						result[1] = i;
					}
				}
				if(distance < result[0]) {
//					如果比当前距离更短则替换
					result[0] = distance;
					result[1] = i;
				}
				}
			}
		return result;
	}
	
	public int[] nearByChar(String s, int location, Character c) {
//		字符串S当前位置num距离c的目标距离，得到结果列表
		int[] result = new int[2];
		result[0] = s.length();
		result [1] = location;
		int distance;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
//				判断是否距离更近，负数代表左旋，正数代表右旋
//				数组第一位代表步数，第二位代表当前位置
				distance = Math.abs(i - location);
				if(s.length() - distance < distance) {
//					若反向距离更近则取反向距离
					distance = s.length() - distance;
				}

				if(distance < result[0]) {
//					如果比当前距离更短则替换
					result[0] = distance;
					result[1] = i;
				}
				}
			}
		return result;
	}
}
