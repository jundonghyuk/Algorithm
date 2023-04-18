package Sorting.BOJ_11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(K-1));
    }
}
