import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = "";
       s = br.readLine();
       int length = s.length();
       int answer = 1;

       if (length%2==1) {
           for (int i=0;i<length;i++) {
               if (!(s.charAt(i)==s.charAt(length-1-i))) {
                   answer = 0;
               }
           }
       }

       if (length%2==0) {
           for (int i=0; i<length; i++) {
               if (!(s.charAt(i)==s.charAt(length-1-i))) {
                   answer = 0;
               }
           }
       }

       System.out.println(answer);
    }
}