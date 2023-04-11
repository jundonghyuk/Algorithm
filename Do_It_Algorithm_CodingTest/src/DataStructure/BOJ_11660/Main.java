package DataStructure.BOJ_11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());

        int[][] list = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if (i == 0) {
                    list[i][j] = Integer.parseInt(st.nextToken());
                } else {
                    list[i][j] = Integer.parseInt(st.nextToken()) + list[i - 1][j];
                }
            }
        }
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int leftRow = Integer.parseInt(st.nextToken()) - 1;
            int leftCol = Integer.parseInt(st.nextToken()) - 1;
            int rightRow = Integer.parseInt(st.nextToken()) - 1;
            int rightCol = Integer.parseInt(st.nextToken()) - 1;
            int sum = 0;

            for (int j = leftCol; j <= rightCol; j++) {
                sum += list[rightRow][j];
                if (leftRow > 0) {
                    sum -= list[leftRow - 1][j];
                }
            }
            System.out.println(sum);
        }
    }
}
