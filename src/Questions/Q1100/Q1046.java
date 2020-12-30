package Questions.Q1100;

import java.util.Arrays;

public class Q1046 {
    public int lastStoneWeight(int[] stones) {
        int index = stones.length-1;
        if(stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        while(index > 0) {
            if(stones[index] == stones[index-1]) {
                stones[index] = 0;
                stones[index-1] = 0;
                index -= 2;
            }else {
                stones[index-1] = stones[index]-stones[index-1];
                stones[index] = 0;
                index--;
                int[] newStones = new int[index+1];
                for(int i=0; i<=index; i++) {
                    newStones[i] = stones[i];
                }
                return lastStoneWeight(newStones);
            }
        }
        return stones[0];
    }
}
