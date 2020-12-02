package main;
import java.util.*;

public class Main{
    public static void main(String args[]){
        char[] OPERATOR = new char[]{'+','-','*','/'};
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] inputs = s.split(" ");
        int[] nums = new int[4];
        boolean containJoker = false;
        for(int i = 0; i<4; i++){
            String input =inputs[i].trim();
            if(input == "JOKER"){
                System.out.println("ERROR");
                containJoker = true;
                break;
            }else if(input.equals("J")){
                nums[i] = 11;
            }else if(input.equals("Q")){
                nums[i] = 12;
            }else if(input.equals("K")){
                nums[i] = 13;
            }else if(input.equals("A")){
                nums[i] = 1;
            }else{
                nums[i] = Integer.parseInt(input);
            }
        }
        if(!containJoker){
            Arrays.sort(nums);
            int res = 0;
            int t = 0;
            int res1 = 0;
            boolean find = false;
            for(int i = 0; i < 4 && !find ; i++){
                for(int j = 0; j < 4 && !find; j++){
                    for(int k = 0; k < 4 && !find; k++){
                        res1 = calculate(nums[i],nums[j],OPERATOR[k]);
                        int l=0;
                        int m=0;
                        for(;l<4;l++){
                            if (l!=i && l!=j){
                                break;
                            }
                        }
                        for(;m<4;m++){
                            if (m!=i && m!=j && m!=l){
                                break;
                            }
                        }
                        for(int q = 0; q<4 && !find; q++){
                            int res2 = calculate(nums[l],nums[m],OPERATOR[q]);
                            for(int qq=0; qq<4; qq++){
                                res = calculate(res1,res2,OPERATOR[qq]);
                                if(res == 24){
                                    System.out.println(nums[i]+OPERATOR[k]+nums[j]+OPERATOR[qq]+nums[l]+OPERATOR[q]+nums[m]);
                                    find = true;
                                    break;
                                }
                            }
                        }
                        for(int q = 0; q<4 && !find; q++){
                            int res2 = calculate(nums[m],nums[l],OPERATOR[q]);
                            for(int qq=0; qq<4; qq++){
                                res = calculate(res1,res2,OPERATOR[qq]);
                                if(res == 24){
                                    System.out.println(nums[i]+OPERATOR[k]+nums[j]+OPERATOR[qq]+nums[m]+OPERATOR[q]+nums[l]);
                                    find = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if(!find){
                System.out.println("NONE");
            }
        }
        
    }
    
    public static int calculate(int i, int j, char operator){
        if(operator == '+'){
            return i+j;
        }
        else if(operator == '-'){
            return i-j;
        }
        else if(operator == '*'){
            return i+j;
        }
        else{
            if(j == 0) {
                return 10000;
            }
            return i/j;
        }
    }
}