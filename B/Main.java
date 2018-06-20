import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int gcp = Integer.MAX_VALUE;
        int cpp = Integer.MAX_VALUE;
        int pgp = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        while((s.contains("GC") || s.contains("CP"))||s.contains("PG")){
            if(s.length()>=3){
                if(s.contains("GC")){
                    gcp = s.indexOf("GC");
                    min = Math.min(gcp,min);
                }
                if(s.contains("CP")){
                    cpp = s.indexOf("CP");
                    min = Math.min(cpp,min);
                }
                if(s.contains("PG")){
                    pgp = s.indexOf("PG");
                    min = Math.min(pgp,min);
                }
                if(min == 0){
                    s = s.substring(2);
                }else if(min ==s.length()-2){
                    s = s.substring(0,s.length()-2);
                }else{
                    s = s.substring(0,min) + s.substring(min+2,s.length());
                }
                min = s.length();
            }
        }
        System.out.println(s.length());
    }
}