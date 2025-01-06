import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      int big = 0;
      int num = 0;
      int index = 0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      for(int i=0; i<9;i++) {
          num = Integer.parseInt(br.readLine());
          if(big<=num) {
              big = num;
              index = i+1;
          }
      }
        System.out.println(big);
        System.out.println(index);
    }
}