import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long answer = 0;
        for(long i = (a+k-1)/k;i<(b+k-1)/k;i++){
            long x = k*i;
            if(x %k == 0){
                answer += x;
            }
        }
        System.out.println(answer);
    }
}