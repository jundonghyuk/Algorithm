package Sorting.BOJ_1427;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) - '0');
        }
        list.sort(Comparator.reverseOrder());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int num : list) {
            bw.write(String.valueOf(num));
        }
        bw.flush();
        bw.close();
    }
}
