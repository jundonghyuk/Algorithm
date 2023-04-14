package DataStructure.BOJ_1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }
        int cnt = 0;
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;

            while (left < right) {
                // check
                if (i == left) {
                    left++;
                }
                if (i == right) {
                    right--;
                }

                if (left >= right) {
                    break;
                }

                // logic
                if (list.get(left) + list.get(right) < list.get(i)) {
                    left++;

                } else if (list.get(left) + list.get(right) > list.get(i)) {
                    right--;

                } else {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
