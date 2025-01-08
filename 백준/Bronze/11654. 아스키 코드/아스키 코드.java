import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
     char a;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     a = br.readLine().charAt(0);
     System.out.print((int)a);
    }
}
