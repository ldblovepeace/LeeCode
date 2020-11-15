package Questions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q402 {
	
	public String removeKdigits(String num, int k) {
		String result = num;


		if(num.length() == k) {
			return "0";
		}
		
		while (k>0) {
			int max=0;
			boolean find = false;
			for(int i = 0; i< result.length()-1; i++) {
				if(result.charAt(i+1) < result.charAt(i)) {
					max = i;
					find = true;
					break;
				}
			}
			
			if(!find) {
				max = result.length()-1;
			}
			
			result = result.substring(0,max)+result.substring(max+1,result.length());
			k--;
		}
		
		result = result.replaceAll("^(0+)", "");
		
		if(result.equals("")) {
			return "0";
		}
		return result;
	}
	
	public String removeKdigits1(String num, int k) {
		String result = num;
		if(num.length() == k) {
			return "0";
		}
		
		List<Integer> l = new ArrayList<>();
		for( int i = 0; i< num.length()-1; i++) {
			if(num.charAt(i+1) < num.charAt(i)) {
				l.add(i);
			}
		}
		
				
		for(int i = 0; i< k && l.size()-i > 0; i++) {
			int location = l.get(i) - i;
			if(location == result.length()) {
				result = result.substring(0,location-1);
			}else {
				result = result.substring(0,location) + result.substring(location+1,result.length());
			}
		}
		
		while(l.size() - k < 0 ) {
			int max = maxIndex(result);
			result = result.substring(0,max)+result.substring(max+1,result.length());
			k--;
		}
		
		result = result.replaceAll("^(0+)", "");
		
		if(result.equals("")) {
			return "0";
		}
		return result;
    }
	
	
	 public String removeKdigits3(String num, int k) {
	        if (num.length() == k) return "0";
	        StringBuilder s = new StringBuilder(num);
	        for (int i = 0; i < k; i++) {
	            int idx = 0;
	            for (int j = 1; j < s.length() && s.charAt(j) >= s.charAt(j - 1); j++) idx = j;
	            s.delete(idx, idx + 1);
	            while (s.length() > 1 && s.charAt(0) == '0') s.delete(0, 1);
	        }
	        return s.toString();
	    }
	
	public int maxIndex(String num) {
		int res = 0;
		for(int i = 0; i < num.length(); i++) {
			if(num.charAt(i) > num.charAt(res)) {
				res = i;
			};
		}
		return res;
	}
	
	public String removeKdigits4(String num, int k) {
		StringBuilder result = new StringBuilder(num);

		if(num.length() == k) {
			return "0";
		}
		
		while (k>0) {
			int max=0;
			boolean find = false;
			for(int i = 0; i< result.length()-1; i++) {
				if(result.charAt(i+1) < result.charAt(i)) {
					max = i;
					find = true;
					break;
				}
			}
			
			if(!find) {
				max = result.length()-1;
			}
			
			result = result.delete(max,max+1);
			k--;
		}
		
		 while (result.length() > 1 && result.charAt(0) == '0') {
			 result.delete(0, 1);
		 }
		
		if(result.length() == 0) {
			return "0";
		}
		return result.toString();
	}
	
	
//	作者：LeetCode-Solution
//	链接：https://leetcode-cn.com/problems/remove-k-digits/solution/yi-diao-kwei-shu-zi-by-leetcode-solution/
//	来源：力扣（LeetCode）
//	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
	 public String removeKdigits5(String num, int k) {
	        Deque<Character> deque = new LinkedList<>();
	        int length = num.length();
	        for (int i = 0; i < length; ++i) {
	            char digit = num.charAt(i);
	            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
	                deque.pollLast();
	                k--;
	            }
	            deque.offerLast(digit);
	        }
	        
	        for (int i = 0; i < k; ++i) {
	            deque.pollLast();
	        }
	        
	        StringBuilder ret = new StringBuilder();
	        boolean leadingZero = true;
	        while (!deque.isEmpty()) {
	            char digit = deque.pollFirst();
	            if (leadingZero && digit == '0') {
	                continue;
	            }
	            leadingZero = false;
	            ret.append(digit);
	        }
	        return ret.length() == 0 ? "0" : ret.toString();
	    }


}
