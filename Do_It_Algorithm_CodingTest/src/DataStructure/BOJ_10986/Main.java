package DataStructure.BOJ_10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long sum = 0;
        long[] list = new long[cnt];
        long[] rest = new long[length];
        for (int i = 0; i < cnt; i++) {
            if(i == 0) {
                list[i] = Long.parseLong(st.nextToken());
            } else {
                list[i] = (Long.parseLong(st.nextToken()) + list[i - 1]);
            }
            int remain = (int)(list[i] % length);
            if(remain == 0) {
                sum++;
            }
            rest[remain]++;
        }
        for (int i = 0; i < length; i++) {
            if(rest[i] > 1) {
                sum += (rest[i] * (rest[i] - 1) / 2);
            }
        }

        System.out.println(sum);
    }
}
