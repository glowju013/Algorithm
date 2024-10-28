import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int j;
    static int count = 0;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int start = 1;
        int end = M;
        st = new StringTokenizer(br.readLine());
        j = Integer.parseInt(st.nextToken());
        int[] where = new int[j];
        for(int i=0;i<j;i++) {
            st = new StringTokenizer(br.readLine());
            where[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<j;i++) {
            int tmp = where[i];
            if(tmp<start){
                count += start-tmp;
                end -= start-tmp;
                start = tmp;
            }
            if(tmp>end) {
                count += tmp-end;
                start += tmp-end;
                end = tmp;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}


