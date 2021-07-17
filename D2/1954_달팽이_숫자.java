import java.io.*;
import java.util.*;

class Solution {
    static int[][] table;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());
            table = new int[n][n];

            //build table
            tornadoTable();

            sb.append("#" + T + "\n");
            sb.append(printTable());
        }
        System.out.println(sb);
    }

    public static void tornadoTable() {
        int num = 1;
        int rightX = 0, rightY = 0;
        int downX = 1, downY = n - 1;
        int leftX = n - 1, leftY = n - 2;
        int upX = n - 2, upY = 0;
        int sub = 0;

        while (num <= n * n) {
            //right
            for (int i = rightY; i < n - sub; i++)
                table[rightX][i] = num++;

            rightX++;
            rightY++;

            //down
            for (int i = downX; i < n - sub; i++)
                table[i][downY] = num++;
            downX++;
            downY--;


            //left
            for (int i = leftY; i >= 0 + sub; i--)
                table[leftX][i] = num++;
            leftX--;
            leftY--;

            //up
            for (int i = upX; i >= 0 + sub + 1; i--)
                table[i][upY] = num++;
            upX--;
            upY++;

            sub++;
        }
    }

    public static StringBuilder printTable() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.append(table[i][j] + " ");
            }
            result.append("\n");
        }
        return result;
    }
}
