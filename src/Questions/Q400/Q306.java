package Questions.Q400;

public class Q306 {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        
        for(int i=1; i<=n/2; i++) {
            for(int j=i+1; j<=(n+i)/2; j++) {
                if(isAdditiveNumber(num,i,j)) {
                    return true;
                }
            }
            if(num.charAt(0) == '0') {
                return false;
            }
        }
        
        return false;
    }   
    
    public boolean isAdditiveNumber(String num, int firstLocation, int secondLocation) {
//        题目需要处理数字开头是0的情况，遇到中间拆分出的字符开头是0，且拆分长度不为1，直接返回false
        int n = num.length();
        if(n - secondLocation < secondLocation - firstLocation) {
            return false;
        }
        
        if(num.substring(firstLocation, firstLocation + 1).equals("0") && secondLocation - firstLocation != 1) {
            return false;
        }
        
        String num1 = num.substring(0, firstLocation);
        String num2 = num.substring(firstLocation, secondLocation);
        int thirdLocation = secondLocation +  stringAdd(num1, num2).length();
        
        while(thirdLocation <= n) {
            if(num.substring(secondLocation, secondLocation + 1).equals("0") && thirdLocation - secondLocation != 1) {
                return false;
            }
            String num3 = num.substring(secondLocation, thirdLocation);
            
            if(!num3.equals(stringAdd(num1,num2))) {
                return false;
            }
            num1 = num2;
            num2 = num3;
            secondLocation = thirdLocation;
            thirdLocation += stringAdd(num1,num2).length();
        }
        if(thirdLocation != n + stringAdd(num1, num2).length()) {
            return false;
        }
        return true;
    }
    
    public String stringAdd(String s1, String s2) {
        int n = Math.max(s1.length(), s2.length());
        int n1 = s1.length();
        int n2 = s2.length();
        int[] record = new int[n];
        for(int i = n-1; i >= 0; i--) {
            if(n - i <= n1) {
                record[i] += s1.charAt(n1 - n +i) - '0';
            }
            if(n - i <= n2) {
                record[i] += s2.charAt(n2 - n +i) - '0';
            }
        }
        for(int i=n-1; i>0; i--) {
            if(record[i] >= 10) {
                record[i-1] += record[i]/10;
                record[i] %= 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<record.length; i++) {
            sb.append(record[i]);
        }
        return sb.toString();
    }
}
