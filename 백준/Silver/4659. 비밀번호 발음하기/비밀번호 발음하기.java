import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String result = "";
        while(true) {
            s = br.readLine();
            if(s.equals("end")) {
                break;
            }

             result += "<";
             result += s;
             result += ">";

             String regex = "^[^aeiou]+$|[aeiou]{3,}|[^aeiou]{3,}|([^eo])\\1+";
             Pattern pattern = Pattern.compile(regex);
             Matcher matcher;
            matcher = pattern.matcher(s);
            result += matcher.find()?" is not acceptable.\n":" is acceptable.\n";


        }
        System.out.println(result);

    }
}


