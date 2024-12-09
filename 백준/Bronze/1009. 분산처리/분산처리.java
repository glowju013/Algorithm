import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int T;
        static int a;
        static int b;
        static int num;
        static int answer;
        static BufferedReader br;
        static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            num = 1;

            if((a>=100 && a<1) || (b>=1000000 && b<1)){
                answer = -1;
            }

            for (int j=0; j<b; j++) {
                if (num>=10) {
                    num %=10;
                }
                num *= a;

            }

            if (answer==-1) {
                System.out.println(answer);
            }
            else {
                answer = num%10;
                if(answer==0){
                    answer=10;
                }
                System.out.println(answer);
            }

        }
    }

}
