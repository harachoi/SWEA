import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hour = 0;
            int min = 0;
            for (int j = 0; j < 2; j++) {
                hour += Integer.parseInt(st.nextToken());
                min += Integer.parseInt(st.nextToken());
            }
            if (min >= 60) {
                hour++;
                min -= 60;
            }
            if (hour > 12) hour -= 12;
            sb.append("#" + i + " " + hour + " " + min + "\n");
        }
        System.out.println(sb);
    }
}
