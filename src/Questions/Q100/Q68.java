package Questions.Q100;

import java.util.ArrayList;
import java.util.List;

public class Q68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        int n = words.length;
        int startIndex = 0;
        while(startIndex < words.length) {
            String line = "";
            int endIndex = endIndex(words, maxWidth, startIndex);
            int wordNums = endIndex - startIndex + 1; //此行放置的字符数量
            int wordWidth = 0;
            for(int i=startIndex; i<=endIndex; i++) {
//                得到字符占的空间
                wordWidth += words[i].length();
            }
            int spaceNums = maxWidth - wordWidth; //空格占的空间 
            int remainSpaces = (wordNums == 1) ? 0 : spaceNums % (wordNums-1); // 获得多余的空格
            int avgSpaceNums = (wordNums == 1) ? spaceNums : spaceNums/(wordNums-1); //获得平均分布的长度,2个单词需要1个分割空格
            String avgSpace = "";
            for(int j=0; j<avgSpaceNums; j++) {
//              获得平均的空格长度
                avgSpace += " ";
            }        
            if(endIndex != words.length - 1) {
//                不是最后一行
                for(int i = startIndex; i<endIndex; i++) {
                    line += words[i]; //先扩充此单词
                    line += avgSpace;//再扩充平均空格
                    if(remainSpaces != 0) {
//                        如果不能平均分布，再多扩充1个空格
                        line += " ";
                        remainSpaces--;
                    }
                }
                line += words[endIndex];//扩充最后一个字符
                if(wordNums == 1) {
//                    如果改行只有一个单词，后面补充空格
                    line += avgSpace;
                }
            }else {
//                处理最后一行
                for(int i = startIndex; i<=endIndex; i++) {
                    line += words[i]; //先扩充此单词
                    line += " ";//最后一行单词间隔为1个空格
                }
                if(line.length() - 1 == maxWidth) {
//                    若刚好1多一个空格，去掉末尾的空格
                    line = line.substring(0, line.length()-1);
                }
                while(line.length() < maxWidth) {
//                  若长度不够，补空格
                  line += " ";
              }
            }
            
            res.add(line);
            startIndex = endIndex + 1;
        }
        
        return res;
    }
    
    public int endIndex (String[] words, int maxWidth, int startIndex) {
//        根据开始位置和最大长度，贪心得到可以放置的string字符串中结尾位置
        int length = 0;
        for(int i=startIndex; i<words.length; i++) {
            length += words[i].length() + 1;//中间最少隔1个字符
            if(length - 1 == maxWidth) {
                return i;
            }
            if(length > maxWidth) {
                return i-1;
            }
        }
        return words.length-1;
    }
}
