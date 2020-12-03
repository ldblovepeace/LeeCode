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
                
//                 for(int i = 0; i<4; i++){
//                     Integer.valueOf(Integer.parseInt(s)>>8*i,"2") ;
//                 }
                System.out.println();
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