package Questions.Q200;

import java.util.ArrayList;
import java.util.List;

public class Q119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<>();
		
		if(rowIndex == 0) {
			res.add(1);
			return res;
		}else if(rowIndex == 1) {
			res.add(1);
			res.add(1);
			return res;
		}else {
			List<Integer> lastRow = getRow(rowIndex - 1);
			for(int i = 0; i <= rowIndex ; i++) {
				if(i==0 || i == rowIndex) {
					res.add(1);
				} else {
					res.add(lastRow.get(i-1) + lastRow.get(i));
				}
			}
		} 
		
		return res;
    }
}
