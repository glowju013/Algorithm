import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N, M;
      StringTokenizer st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken()); // 바구니 개수
      M = Integer.parseInt(st.nextToken()); // 공을 넣는 횟수
      int i,j,k;
      int[] arr = new int[N];
      for (int l=0;l<M;l++) {
          st = new StringTokenizer(br.readLine());
          i = Integer.parseInt(st.nextToken());
          j = Integer.parseInt(st.nextToken());
          k = Integer.parseInt(st.nextToken());
          for(int m=i;m<=j;m++) {
              arr[m-1] = k;
          }
      }

      for(int c=0;c<N;c++) {
        System.out.print(arr[c] + " ");
      }


    }
}