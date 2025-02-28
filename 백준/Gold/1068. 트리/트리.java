import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static boolean[] visit;
    static List<Integer> tree[];
    static int remove;
    static int count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int root = 0;
        visit = new boolean[N];

        tree = new ArrayList[N];

        // 리스트 초기화
        for (int i=0; i<N; i++) {
            tree[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == -1) {
                root = i;
            }
            else {
                tree[num].add(i);
            }
        }

        remove = Integer.parseInt(br.readLine());

        if (root == remove) {
            System.out.println(0);
        }
        else {
            dfs(root);
            System.out.println(count);
        }

    }

    static void dfs(int u) {
        visit[u] = true;
        int child = 0;
        for (int i: tree[u]) {
            if (i!=remove && !visit[i]) {
                child++;
                dfs(i);
            }
        }

        if (child == 0) {
            count++;
        }
    }

}
