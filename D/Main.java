import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        
        long answer = 0;
        long ax = 0;
        long bx = 0;
        if(a>=0){
            ax = (a+k-1)/k;
        }else{
            ax = a/k;
        }
        if(b>=0){
            bx = (b+k-1)/k;
        }else{
            bx = b/k;
        }
        answer = k*((bx-1)*bx/2-(ax-1)*ax/2);

        System.out.println(answer);
    }
}