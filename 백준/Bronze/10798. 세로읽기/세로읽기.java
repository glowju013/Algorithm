import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for (int i=0; i<5; i++) {
            String str = br.readLine();
            char[] tmp = str.toCharArray();
            for(int q = 0; q<tmp.length; q++) {
                if (tmp[q]!=' ' && tmp[q]!=0) {
                    arr[i][q] = tmp[q];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int z=0; z<15; z++) {
            for (int d=0; d<5;d++) {
                if(arr[d][z]!=' ' && arr[d][z]!=0) {
                    sb.append(arr[d][z]);
                }
            }
        }

        System.out.println(sb);
    }
}
