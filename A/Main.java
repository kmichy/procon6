import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = 0;
        String a = str.substring(1,str.length());
        if(str.charAt(0) == 'M'){
            answer = 1867 + Integer.parseInt(a);
        }
        if(str.charAt(0) == 'T'){
            answer = 1911 + Integer.parseInt(a);
        }
        if(str.charAt(0) == 'S'){
            answer = 1925 + Integer.parseInt(a);
        }
        if(str.charAt(0) == 'H'){
            answer = 1988 + Integer.parseInt(a);
        }
        if(str.charAt(0) == 'X'){
            answer = 2018 + Integer.parseInt(a);
        }
        System.out.println(answer);
    }
}