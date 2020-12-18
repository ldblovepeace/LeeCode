package Questions.Q300;

public class Q273 {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        
        int billion = num/1000000000;
        num = num - billion*1000000000;
        int million = num/1000000;
        num = num - million*1000000;
        int thousand = num/1000;
        int one = num - thousand*1000;
        
        String res = "";
        
        if(billion != 0) {
            res += hundredsToWord(billion) + "Billion ";
        }
        if(million != 0) {
            res += hundredsToWord(million) + "Million ";
        }
        if(thousand != 0) {
            res += hundredsToWord(thousand) + "Thousand ";
        }
        if(one != 0) {
            res += hundredsToWord(one);
        }
        
        return res.trim();
    }
    
    public String hundredsToWord(int num) {
        String[] ones = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] tenToTwenty = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] tens = {"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        int hundred = num/100;
        num = num - hundred*100;
        int ten = num/10;
        num = num - ten*10;
        StringBuilder sb = new StringBuilder();
        if(hundred != 0) {
            sb.append(ones[hundred-1]);
            sb.append(" Hundred ");
        }
        if(ten > 1) {
            sb.append(tens[ten-1]);
            sb.append(" ");
            if(num!=0) {
                sb.append(ones[num-1]);
                sb.append(" ");
            }
        }else if(ten == 1) {
            sb.append(tenToTwenty[num]);
            sb.append(" ");
        }else{
            if(num!=0) {
                sb.append(ones[num-1]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
