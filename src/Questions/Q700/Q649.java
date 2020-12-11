package Questions.Q700;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q649 {
    
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        char c;
        for (int i = 0; i < n; i++) {
            c = senate.charAt(i);
            if (c == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.remove();
            int d = dire.remove();
            if (r < d) {
                radiant.offer(r + n);
            } else {
                dire.offer(d + n);
            } 
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
    
    public String predictPartyVictory2(String senate) {
//  最佳策略是r或d只会禁言在他位置之后的对方阵营
        char[] s = senate.toCharArray();
        List<Integer> Radiant = new ArrayList<>();
        List<Integer> Dire = new ArrayList<>();
        
        for(int i=0; i<senate.length(); i++) {
            if(s[i] == 'R'){
                Radiant.add(i);
            }
            if(s[i] == 'D') {
                Dire.add(i);
            }
        }
        
        while(!Radiant.isEmpty() || !Dire.isEmpty()) {
            for(int i=0; i<senate.length(); i++) {
                if(s[i] == 'R') {
                    if(Dire.isEmpty()) {
                        return "Radiant";
                    }else {
                        int j=0;
                        while(j<Dire.size() && Dire.get(j) < i) {
                            j++;
                        }
                        if(j == Dire.size()) {
//                            return "Radiant";
                            s[Dire.get(0)] = '0';
                            Dire.remove(0);
//                            return (Dire.size() < Radiant.size()) ? "Radiant":"Dire";
                        }else {
                            s[Dire.get(j)] = '0';
                            Dire.remove(j);
                        }
                    }
                }
                if(s[i] == 'D') {
                    if(Radiant.isEmpty()) {
                        return "Dire";
                    }else {
                        int j=0;
                        while(j<Radiant.size() && Radiant.get(j) < i) {
                            j++;
                        }
                        if(j == Radiant.size()) {
//                            return "Dire";
                            s[Radiant.get(0)] = '0';
                            Radiant.remove(0);
//                            return (Dire.size() < Radiant.size()) ? "Radiant":"Dire";
                        }else {
                            s[Radiant.get(j)] = '0';
                            Radiant.remove(j);
                        }
                    }
                }
            }
        }
        
//        if(Radiant.isEmpty() && Dire.isEmpty()) {
//            return "";
//        }
        
        if(Radiant.isEmpty()) {
            return "Dire";
        }else {
            return "Radiant";
        }

    }
    
    public String predictPartyVictory1(String senate) {
//      这个函数的策略是从头往后禁言
        Queue<Integer> Radiant = new PriorityQueue<>();
        Queue<Integer> Dire = new PriorityQueue<>();

        char[] s = senate.toCharArray();
        for(int i=0; i<senate.length(); i++) {
            if(s[i] == 'R'){
                Radiant.offer(i);
            }
            if(s[i] == 'D') {
                Dire.offer(i);
            }
        }
        
        while(Radiant.peek() !=null || Dire.peek() != null) {
            for(int i=0; i<senate.length(); i++) {
                if(s[i] == 'R') {
                    if(Dire.peek() != null) {
                        s[Dire.poll()] = '0';
                    }else {
                        return "Radiant";
                    }
                }
                if(s[i] == 'D') {
                    if(Radiant.peek() != null) {
                        s[Radiant.poll()] = '0';
                    }else {
                        return "Dire";
                    }
                }
            }
        }
        
        
        if(Radiant.peek() != null) {
            return "Radiant";
        }else{
            return "Dire";
        }
    }
}
