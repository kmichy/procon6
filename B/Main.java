import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<String> dq = new ArrayDeque<>();
        dq.push(s.substring(0,1));
        for(long i = 1;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            if(dq.size() != 0){
                sb.append(dq.getFirst());
            }
            sb.append(s.substring((int)i,(int)i+1));
            String str = sb.toString();
            if(!str.equals("GC") && (!str.equals("CP") && !str.equals("PG"))){
                dq.push(s.substring((int)i,(int)i+1));
            }else{
                dq.pop();
            }
        }
        System.out.println(dq.size());
    }
}