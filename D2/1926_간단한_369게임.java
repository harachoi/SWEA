import java.io.*;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            String clap = "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') clap += "-";
            }
            sb.append(clap.length() > 0 ? clap : i).append(" ");
        }
        System.out.println(sb);
    }
}
