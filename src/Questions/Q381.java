package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Q381 {
//	hashmap用于记录value的数量和下标位置
	HashMap<Integer,Set<Integer>> index;
	List<Integer> l;
	
	 /** Initialize your data structure here. */
    public Q381() {
    	index = new HashMap<Integer,Set<Integer>>();
    	l = new ArrayList();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
    	l.add(val);
    	if(!index.isEmpty()) {
    		if(!index.get(val).isEmpty()) {
        		index.get(val).add(l.size());
        		return false;
        	}else {
        		Set<Integer> tmp = new HashSet<Integer>();
        		tmp.add(l.size());
        		index.put(val, tmp);
        		return true;
        	}
    	}else {
    		Set<Integer> tmp = new HashSet<Integer>();
    		tmp.add(l.size());
    		index.put(val, tmp);
    		return true;
    	}
    	
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
    	if(index.get(val).isEmpty()||index.get(val) == null) {
    		return false;
    	}else {
    		Iterator<Integer> i = index.get(val).iterator();
    		int tmp = l.get(l.size()-1);
    		l.remove(i.next());
    		this.insert(tmp);
    		return true;
    	}
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
    	int r = (int)Math.random()*(l.size()-1);
    	return l.get(r);
    }
}
