package Questions.Q900;

import java.util.ArrayList;
import java.util.List;

public class Q842 {
    public List<Integer> splitIntoFibonacci(String S) {
      int n = S.length();
      List<Integer> l = new ArrayList<Integer>();
      int starter = 1;
      while(starter<Math.ceil(n/2)+1) {
          int step = 1;
          if(Long.valueOf(S.substring(starter,starter+step))>Integer.MAX_VALUE || Long.valueOf(S.substring(0,starter))>Integer.MAX_VALUE) {
              starter++;
              continue;
          }
          int l1 = Integer.parseInt(S.substring(0,starter));
          int l2 = Integer.parseInt(S.substring(starter,starter+step));
          int sum = l1+l2;
          int sumLength = Integer.toString(sum).length();
          while(starter+step+sumLength < n && isFibonacci(S,starter,step).size() == 0) {
              step++;
              if(S.substring(0,1).equals("0") && step != 1) {
                  l.clear();
                  return l;
              }
              if(Long.valueOf(S.substring(starter,starter+step))>Integer.MAX_VALUE) {
                  break;
              }
              l2 = Integer.parseInt(S.substring(starter,starter+step));
              sum = l1+l2;
              sumLength = Integer.toString(sum).length();
          }
          if(isFibonacci(S,starter,step).size() != 0) {
              return isFibonacci(S,starter,step);
          }else {
              starter++;
          }
      }

      return l;
  }
    
    public List<Integer> isFibonacci(String S, int i, int nextStep) {
        int n = S.length();
        List<Integer> l = new ArrayList<>();
        if(i+nextStep > n) {
            l.clear();
            return l;
        }
        if(Long.valueOf(S.substring(i,i+nextStep))>Integer.MAX_VALUE || Long.valueOf(S.substring(0,i))>Integer.MAX_VALUE) {
            return l;
        }
        int l1 = Integer.parseInt(S.substring(0,i));
        int l2 = Integer.parseInt(S.substring(i,i+nextStep));
        int sum = 0;
        if(S.substring(i,i+1).equals("0") && nextStep != 1) {
            return l;
        }
        if(S.substring(0,1).equals("0") && nextStep != 1) {
            return l;
        }
        l.add(l1);
        l.add(l2);
        while(i+nextStep != n ) {
            sum = l1+l2;
            i = i+nextStep;
            nextStep = Integer.toString(sum).length();
            if(i+nextStep > n) {
                l.clear();
                return l;
            }
            if(S.substring(i,i+1).equals("0") && nextStep != 1) {
                l.clear();
                return l;
            }
            if(Long.valueOf(S.substring(i,i+nextStep))>Integer.MAX_VALUE) {
                l.clear();
                return l;
            }
            int l3 = Integer.parseInt(S.substring(i,i+nextStep));
            if(l3 != sum) {
                l.clear();
                return l;
            }else {
                l.add(l3);
                l1 = l2;
                l2 = l3;
            }
        }
        return l;
    }
    
    public List<Integer> splitIntoFibonacci1(String S) {
//        题意理解错了，以为是要按照固定长度区分
        int n = S.length();
        int max = (int) Math.floor((double)n/3);
        
        List<Integer> l = new ArrayList<Integer>();
        for(int i=1; i<=max; i++) {
            int l1 = Integer.parseInt(S.substring(0,i));
            int l2 = Integer.parseInt(S.substring(i,i+i));
            l.add(l1);
            l.add(l2);
            int sum = l1+l2;
            boolean find = false;
            int step = Integer.toString(sum).length();
            for(int j=i+i; j<n; j=j+step) {
                step = Integer.toString(sum).length();
                l1 = l2;
                if(j+step > n) {
                    break;
                }
                l2 = Integer.parseInt(S.substring(j,j+step));
                if(step!=1 && S.substring(j,j+1).equals("0")) {
                    break;
                }
                if(sum != l2) {
                    break;
                }else {
                    l.add(l2);
                    sum = l1 + l2;
                }
                if(j+step == n) {
                    find = true;
                }
            }
            if(find) {
                break;
            }else {
                l.clear();
            }
        }
        
        return l;
    }
}
