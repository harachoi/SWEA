import java.io.*;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            String str = br.readLine();
            boolean check = false;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    check = true;
                    break;
                }
            }
            sb.append("#" + test + " ").append(check ? 0 : 1).append("\n");
        }
        System.out.println(sb);
    }
}
