import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum +=  Integer.parseInt(st.nextToken());
            }
            sb.append("#" + i + " " + Math.round(sum / 10.0) + "\n");
        }

        System.out.println(sb);
    }
}
