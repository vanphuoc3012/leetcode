package hackerrank;

import java.io.*;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        int hh = Integer.valueOf(s.substring(0, 2));
        char time = s.charAt(8);
        s = s.substring(2, 8);
        if(time == 'P') {
            if(hh < 12) hh = hh + 12;
            return hh + s;
        } else {
            if(hh == 12) {
                hh = 0;
                return "00" + s;
            };
            return "0" + hh + s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
