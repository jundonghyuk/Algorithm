package Sorting.BOJ_1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Position[] arr = new Position[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Position(i, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < N; i++) {

            if (max < arr[i].idx - i) {
                max = arr[i].idx - i;
            }
        }
        System.out.println(max + 1);
    }

    static class Position implements Comparable<Position> {

        int idx;
        int value;

        public Position(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }

        @Override
        public int compareTo(Position o) {
            return this.value - o.value;
        }
    }
}
