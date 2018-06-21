import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();
        int[][] p = new int[m][m];
        int[][] q = new int[m][m];
        int count = 0;
        String name = "";
        for(int i = 0;i<k;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            count++;
            if(count % 2 == 0){
                name = "RITA";
                p[a-1][b-1] = 1;
            }else{
                name = "UNI";
                q[a-1][b-1] = 1;
            }
            if((p[0][0] == 1 &&p[1][0] == 1) &&(p[2][0] == 1 &&p[3][0] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[0][1] == 1 &&p[1][1] == 1) &&(p[2][1] == 1 &&p[3][1] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[0][2] == 1 &&p[1][2] == 1) &&(p[2][2] == 1 &&p[3][2] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[0][3] == 1 &&p[1][3] == 1) &&(p[2][3] == 1 &&p[3][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[0][0] == 1 &&p[0][1] == 1) &&(p[0][2] == 1 &&p[0][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[1][0] == 1 &&p[1][1] == 1) &&(p[1][2] == 1 &&p[1][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[2][0] == 1 &&p[2][1] == 1) &&(p[2][2] == 1 &&p[2][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[3][0] == 1 &&p[3][1] == 1) &&(p[3][2] == 1 &&p[3][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[0][0] == 1 &&p[1][1] == 1) &&(p[2][2] == 1 &&p[3][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((p[0][3] == 1 &&p[1][2] == 1 )&&(p[2][1] == 1 &&p[3][0] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if(count == k){
                System.out.println("DRAW");
                break;
            }

            if((q[0][0] == 1 &&q[1][0] == 1) &&(q[2][0] == 1 &&q[3][0] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[0][1] == 1 &&q[1][1] == 1) &&(q[2][1] == 1 &&q[3][1] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[0][2] == 1 &&q[1][2] == 1) &&(q[2][2] == 1 &&q[3][2] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[0][3] == 1 &&q[1][3] == 1) &&(q[2][3] == 1 &&q[3][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[0][0] == 1 &&q[0][1] == 1) &&(q[0][2] == 1 &&q[0][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[1][0] == 1 &&q[1][1] == 1) &&(q[1][2] == 1 &&q[1][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[2][0] == 1 &&q[2][1] == 1) &&(q[2][2] == 1 &&q[2][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[3][0] == 1 &&q[3][1] == 1) &&(q[3][2] == 1 &&q[3][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[0][0] == 1 &&q[1][1] == 1) &&(q[2][2] == 1 &&q[3][3] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if((q[0][3] == 1 &&q[1][2] == 1 )&&(q[2][1] == 1 &&q[3][0] == 1)){
                System.out.print(name + " ");
                System.out.println(count);
                break;
            }
            else if(count == k){
                System.out.println("DRAW");
            }
        }
    }
}