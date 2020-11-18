package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q134 {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int length  = gas.length;
//        int[] remainGas = new int[length];

        // for(int i = 0; i < length; i++){
        //     remainGas[i] = gas[i] - cost[i];
        // }

        for(int i = 0; i < length; i++){
        	boolean noWay = false;
        	int remain = 0;
            for(int j = i; j < length; j ++){
                remain = remain + gas[j] - cost[j];
                if(remain < 0){
                    noWay = true;
                    break;
                }
            }
            if(!noWay){
                for(int j = 0; j < i; j++){
                    remain = remain + gas[j] - cost[j];
                    if(remain < 0){
                        noWay = true;
                        break;
                    }
                }
            }

            if(!noWay){
                return i;
            }
        }

        return -1;
    }
	
	
	public int canCompleteCircuit2(int[] gas, int[] cost) {
        int length  = gas.length;
        int[] remainGas = new int[length];
        List<Integer> potentialStarter = new ArrayList<>();

         for(int i = 0; i < length; i++){
             remainGas[i] = gas[i] - cost[i];
             if(remainGas[i] > 0) {
            	 potentialStarter.add(i);
             }
         }

        for(int i : potentialStarter){
//        	int i = potentialStarter.get(l);
        	boolean noWay = false;
        	int remain = 0;
            for(int j = i; j < length; j ++){
                remain = remain + gas[j] - cost[j];
                if(remain < 0){
                    noWay = true;
                    break;
                }
            }
            if(!noWay){
                for(int j = 0; j < i; j++){
                    remain = remain + gas[j] - cost[j];
                    if(remain < 0){
                        noWay = true;
                        break;
                    }
                }
            }

            if(!noWay){
                return i;
            }
        }

        return -1;
    }
	
	
	
}
