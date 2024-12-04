import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static boolean check;
    static int zero;
    static int one;
    static int minusOne;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        zero = 0;
        one = 0;
        minusOne = 0;
        // 배열에 수를 입력받기
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        paper(0,0,N);

        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
    }
    public static void paper(int row, int col, int num) {
        check = true;
        if(num==1) {
            if (arr[col][row]==-1){
                minusOne++;
            }
            if (arr[col][row]==0) {
                zero++;
            }
            if (arr[col][row]==1) {
                one++;
            }
            return;
        }

        // 같은 수로 되어있는지 확인한다.
        for (int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[col][row]!=arr[col+i][row+j]){
                    check=false;
                    break;
                }
            }
        }

        // 같은 수로 이루어진 경우 개수를 센다.
        if (check==true) {
            if (arr[col][row]==-1){
                minusOne++;
            }
            if (arr[col][row]==0) {
                zero++;
            }
            if (arr[col][row]==1) {
                one++;
            }
            return;
        }
        else {

            for(int i=0; i<3;i++) {
                for(int j=0; j<3;j++){
                    paper(row+i*(num/3),col+j*(num/3),num/3);
                }
            }
        }
    }
}