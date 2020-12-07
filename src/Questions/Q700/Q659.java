package Questions.Q700;

import java.util.ArrayList;
import java.util.List;

public class Q659 {
    public boolean isPossible(int[] nums) {
        List<Integer[]> l = divide(nums);
        for(Integer[] i:l) {
            if(!isPossibleNums(i)) {
                return false;
            }
        }
        return true;
    }
    
    public List<Integer[]> divide(int[] nums){
        List<Integer[]> l = new ArrayList<>();
        int n = nums.length;
        if(n == 1) {
            Integer[] res = new Integer[n];
            res[0] = nums[0];
            l.add(res);
            return l;
        }
        for(int i=0; i<n-1; i++) {
            int subNumsStart = i;
            while( i<n-1 && nums[i+1] - nums[i] <= 1) {
                i++;
            }
            
            Integer[] subNum = new Integer[i+1-subNumsStart];
            for(int j=0; j<subNum.length; j++) {
                subNum[j] = nums[subNumsStart+j];
            }
            l.add(subNum);
        } 
        if(n>1 && nums[n-1] - nums[n-2] > 1) {
            Integer[] res = new Integer[1];
            res[0] = nums[n-1];
            l.add(res);
        }
        return l;
    }
    public boolean isPossibleNums(Integer[] nums) {
//        不对
//      0-10000数字
      int[] record = new int[10000];
      int n = nums.length;
      if(n<3) {
          return false;
      }
      int max = nums[n-1];
      int min = nums[0];
      for(int i=0; i<n; i++) {
          record[nums[i]-min]++;
//          长度10000最多10000数字
      }
      
      int begin = 0;
      List<List<Integer>> l = new ArrayList<>();
      while(n>0) {
          for(int i=begin; i<nums.length; i++) {
              List<Integer> serial = new ArrayList<Integer>();
              while(record[i] > 0) {
                  record[i] --;
                  n--;
                  serial.add(i+1);
                  i++;
              }
              if(i == begin) {
                  begin++;
                  break;
              }  
              if(serial.size()>0) {
                  l.add(serial);  
              }
          }
      }
      
      for(int i=0; i<l.size(); i++) {
          List<Integer> li = l.get(i);
          int listart = li.get(0);
          if(li.size() < 3) {
              boolean find = false;
              for(List<Integer> lj : l) {
                  int ljend = lj.get(lj.size()-1);
                  if(listart - ljend == 1) {
                      find = true;
                      lj.addAll(li);
                      l.remove(i);
                      break;
                  }
              }
              if(!find) {
                  return false;
              }
          }
      }
      
      
      return true;
  }
    public boolean isPossibleNums1(Integer[] nums) {
//        思路有问题，删除完遇到同一个数字出现多次可能出现问题
//        0-10000数字
        int[] record = new int[10000];
        int n = nums.length;
        if(n<3) {
            return false;
        }
        int max = nums[n-1];
        int min = nums[0];
        for(int i=0; i<n; i++) {
            record[nums[i]-min]++;
//            长度10000最多10000数字
        }
        
        int begin = 0;
        while(n>0) {
            for(int i=begin; i<nums.length; i++) {
                List<Integer> serial = new ArrayList<Integer>();
                while(record[i] > 0) {
                    record[i] --;
                    n--;
                    serial.add(i);
                    i++;
                }
                if(i == begin) {
                    begin++;
                    break;
                }else if(i>begin) {
                    if(serial.size() >= 3) {
                        break;
                    }else if(serial.size() == 1) {
                        int start = serial.get(0);
                        if(start < 2 || start > max-min-2) {
                            return false;
                        }
                    }else if(serial.size() == 2){
                        int start = serial.get(0);
                        int end = serial.get(1);
                        if(start == 0 || end == max-min) {
                            return false;
                        }
                    }
                }
                
            }
        }
        return true;
    }
}
