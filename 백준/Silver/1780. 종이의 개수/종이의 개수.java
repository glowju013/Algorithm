import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean check = true;
    static int N;
    static int minusOne; // -1
    static int zero; // 0
    static int one; // 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N =Integer.parseInt(br.readLine());
        arr = new int[N][N];
        minusOne = 0;
        zero = 0;
        one = 0;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        paper(0,0,N);
        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
    }

    static void paper(int row, int col, int num) {
        check = true;
        if (num == 1) {
            if(arr[col][row]==0)
                zero++;
            else if(arr[col][row]==-1)
                minusOne++;
            else if(arr[col][row]==1)
                one++;
            return;
        }
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                if(arr[col][row]!=arr[col+i][row+j]) {
                    check = false;
                    break;
                }
            }
        }
        if (check == true) {
            if(arr[col][row]==0)
                zero++;
            else if(arr[col][row]==-1)
                minusOne++;
            else if(arr[col][row]==1)
                one++;
            return;
        }
        else {
            for(int i=0;i<3;i++) {
                for(int j=0; j<3; j++) {
                    paper(row+i*(num/3),col+j*(num/3),num/3);
                }
            }
        }
    }

}