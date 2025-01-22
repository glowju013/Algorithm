import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine()); // 2
       int gop = (N*2)-1;
       String gongback = "공백";
       int i = N-1;
       while(i>=0) {
           gongback = " ";
           for (int j=1; j<=gop; j+=2) {
               System.out.print(gongback.repeat(i--));
               String star = "*";
               System.out.print(star.repeat(j));
               System.out.println();
           }
       }
       i = 1;
       gop = (N*2)-1;
       gop -= 2;
       while(i<=N-1) {
           for (int j=gop; j>=1; j-=2) {
               System.out.print(gongback.repeat(i++));
               String star = "*";
               System.out.print(star.repeat(j));
               System.out.println();
           }

       }
    }
}