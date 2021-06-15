import java.io.*;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            sb.append("#" + test).append("\n");
            int n = Integer.parseInt(br.readLine());
            String str = "";
            
            for (int i = 0; i < n; i++) {
                str += "1 ";
                for (int j = 0; j < i - 1; j++) {
                    str += i + " ";
                }
                str += i != 0 ? "1" + "\n" : "\n";
            }
            sb.append(str);
        }
        System.out.println(sb);
    }
}
