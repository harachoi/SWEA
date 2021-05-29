import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int tnum = Integer.parseInt(br.readLine()); // test num
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Integer, Integer> dup = new HashMap<>();
            int maxCount = 0;
            int maxScore = 0;
            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                dup.put(num, dup.getOrDefault(num, 1) + 1);
                if (maxCount <= dup.get(num)) {
                    if (maxScore < num || maxCount < dup.get(num)) {
                        maxCount = dup.get(num);
                        maxScore = num;
                    }
                }
            }
            result.append("#" + tnum + " ").append(maxScore).append("\n");
        }
        System.out.println(result);
    }
}
