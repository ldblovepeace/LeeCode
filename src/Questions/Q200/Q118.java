package Questions.Q200;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		
		for(int i = 0; i< numRows; i++) {
			List<Integer> thisRow = new ArrayList<>();
			List<Integer> upRow = new ArrayList<>();
			if(i == 0) {
				thisRow.add(1);
			}else {
				upRow = res.get(i-1);
				for(int j = 0; j<=i; j++) {
					if(j == 0) {
						thisRow.add(1);
						continue;
					}else if(j == i) {
						thisRow.add(1);
						continue;
					}else {
						thisRow.add(upRow.get(j-1)+upRow.get(j));
						continue;
					}
					
				}
			}
			res.add(thisRow);
			
		}
		
		return res;
    }
}
