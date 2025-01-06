import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      int N;
      int a;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v;
        int count = 0;
        v = Integer.parseInt(br.readLine());
        for(int i=0;i<arr.length;i++) {
            if (arr[i]==v) {
                count++;
            }
        }
        System.out.println(count);
    }
}