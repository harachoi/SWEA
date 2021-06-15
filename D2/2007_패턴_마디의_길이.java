import java.io.*;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int test = 1; test <= t; test++) {
            String str = br.readLine();
            for (int i = 1; i < 10; i++) {
                String sub = str.substring(0,i);
                if (sub.equals(str.substring(i, i+i))) {
                    sb.append("#" + test + " " + i + "\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
