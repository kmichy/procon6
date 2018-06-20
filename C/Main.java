import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] x = sc.nextLine().split(" ");
        int b = sc.nextInt();
        sc.nextLine();
        String[] y = sc.nextLine().split(" ");        
        int c = sc.nextInt();
        sc.nextLine();
        String[] z = sc.nextLine().split(" ");
        String k = sc.nextLine();
        String s = sc.nextLine();
        String t = sc.nextLine();
        int sti = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<x.length;j++){
                if(x[j].equals(s.substring(i))){
                    sti += Math.pow(10,i)*j;
                }
            }
        }
        for(int i = 0;i<t.length();i++){
            for(int j = 0;j<y.length;j++){
                if(x[j].equals(s.substring(i))){
                    sti += Math.pow(10,i)*j;
                }
            }
        }
        String base36 = Integer.toString(sti, c);
        System.out.println(base36);
    }
}