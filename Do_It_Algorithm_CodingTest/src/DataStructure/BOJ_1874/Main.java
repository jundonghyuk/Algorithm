package DataStructure.BOJ_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        StringJoiner sj = new StringJoiner("\n");

        Deque<Integer> dq = new ArrayDeque<>();
        int value = 1;
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (dq.isEmpty()) {
                while(value <= num) {
                    dq.addLast(value);
                    sj.add("+");
                    value++;
                }
                dq.pollLast();
                sj.add("-");
            } else {
                if(dq.getLast() <= num) {
                    while(value <= num) {
                        dq.addLast(value);
                        sj.add("+");
                        value++;
                    }
                    dq.pollLast();
                    sj.add("-");
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(sj);
    }
}
