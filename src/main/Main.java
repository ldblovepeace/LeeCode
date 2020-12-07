package main;

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String s = scan.nextLine();
            if(isIP(s)){
                int res = 0;
                String[] ip = s.split("\\.");
                for(int i=0; i<4; i++){
                    int tmp = Integer.parseInt(ip[i]) ;
                    tmp = tmp<< 8*(3-i);
                    res = res+tmp;
                }
                System.out.println(res);
            }else{
                int tmp = Integer.parseInt(s);
                String res = "";
                for(int i = 0; i<4; i++){
                    res = res + (tmp>>(8*(3-i))) +".";
                    int t = (tmp>>(8*(3-i)))*(int)Math.pow(2,8*(3-i));
                    tmp = tmp-t;
                }
                System.out.println(res.substring(0,res.length()-1));
            }
        }
    }
    
    public static boolean isIP(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '.'){
                return true;
            }
        }
        return false;
    }
}