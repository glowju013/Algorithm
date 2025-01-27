import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int count = N;

        String s = "";
        for(int i=0; i<N; i++) {
            s = br.readLine();
            int prev = 0;
            int[] alphabet = new int[26];
            for (int j=0; j<s.length();j++) {
                int now = s.charAt(j);
                if (prev != now) {
                    if (alphabet[now-97] == 0) {
                        alphabet[now-97]++;
                        prev = now;
                    }
                    else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
