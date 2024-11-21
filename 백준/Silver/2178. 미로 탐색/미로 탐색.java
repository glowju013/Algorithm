import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] checked;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for(int i=0;i<4;i++){
                int nX = current[0]+dx[i];
                int nY = current[1]+dy[i];
                if(nX<0 || nX>=N || nY<0 || nY>=M) {
                    continue;
                }
                if(arr[nX][nY]==0) {
                    continue;
                }
                if(checked[nX][nY]){
                    continue;
                }
                queue.offer(new int[]{nX,nY});
                checked[nX][nY]=true;
                arr[nX][nY]=arr[current[0]][current[1]]+1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      checked = new boolean[N][M];
      String[] strings = new String[N];
      arr = new int[N][M];

      for(int i=0;i<N;i++){
          strings[i] = br.readLine();
      }

      for(int i=0;i<N;i++){
          for(int j=0;j<M;j++){
              arr[i][j] = strings[i].charAt(j)-'0';
          }
      }
      checked[0][0]=true;
      bfs(0,0);
      System.out.print(arr[N-1][M-1]);
    }
}

