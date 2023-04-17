package DataStructure.BOJ_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i <N;i++) {
            dq.addFirst(i+1);
        }
        while(dq.size() != 1) {
            dq.pollLast();
            dq.addFirst(dq.pollLast());
        }
        System.out.println(dq.getFirst());
    }
}
