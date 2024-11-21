import java.io.*;

public class Main {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
         arr = new int[N][N];
        for(int i=0;i<N;i++) {
            String tmp = br.readLine();
           for(int j=0;j<N;j++) {
               int t = tmp.charAt(j)-'0';
               arr[i][j]=t;
           }
        }
        search(0,0,N);
        System.out.println(sb);
    }

    public static void search(int iStart, int jStart, int size) { // N = 4

        int sum = 0;
        for (int i=iStart;i<iStart+size;i++){
            for(int j=jStart;j<jStart+size;j++){
                sum += arr[i][j];
            }
        }

        if (sum == size*size){
            sb.append(1);
            return;
        }
        else if(sum==0){
            sb.append(0);
        }
        else {
            sb.append('(');
            search(iStart, jStart, size/2);
            search(iStart,jStart+(size/2),size/2);
            search(iStart+(size/2),jStart,size/2);
            search(iStart+(size/2),jStart+(size/2),size/2);
            sb.append(')');
        }


    }
}





