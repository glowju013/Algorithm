import java.io.*;
import java.util.*;

public class Main {
    static int N, C;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] arr;
    static int[] count2;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(o1,o2)->map.get(o2)-map.get(o1));
        for (int key : list) {
            for (int i=0;i<map.get(key);i++){
                bw.write(key+" ");
            }
        }
        bw.flush();
    }
}

