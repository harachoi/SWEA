import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = 0;
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                total += num;
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            total -= (max + min);
            sb.append("#" + test + " ").append(Math.round(total / 8.0)).append("\n");
        }
        System.out.println(sb);
    }
}
