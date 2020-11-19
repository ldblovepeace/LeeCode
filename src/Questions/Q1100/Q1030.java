package Questions.Q1100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1030 {
	public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
		int[][] res = new int[R*C][2];
		HashMap<Integer,List<int[]>> record = new HashMap<>(); 
	//	使用hashmap记录坐标和距离，以距离为key，坐标为链表
		for(int i = 0; i< R; i++) {
			for(int j = 0; j<C; j++) {
				int key = Math.abs(i-r0)+Math.abs(j-c0);
				int[] location = new int[] {i,j};
				if(record.containsKey(key)) {
					record.get(key).add(location);
	//          不断扩充同距离坐标位置
				}else {
					List<int []> l = new ArrayList<>();
					l.add(location);
					record.put(key, l);
				}
			}
		}
		
		int maxLength = Math.max(Math.abs(0-r0)+Math.abs(0-c0), Math.abs(R-1-r0)+Math.abs(C-1-c0));
		maxLength = Math.max(maxLength, Math.abs(0-r0)+Math.abs(C-1-c0));
		maxLength = Math.max(maxLength, Math.abs(R-1-r0)+Math.abs(0-c0));
	//          获得最远距离
	    
		int r = 0;
		// r记录结果集位置
		for(int i = 0; i<= maxLength; i++) {
			List<int[]> l = record.get(i);
	//		通过距离遍历hashmap
			for(int[] tmp : l) {
	//			遍历链表
				res[r] = tmp;
				r++;
			}
		}
		
		return res;

	}
}
