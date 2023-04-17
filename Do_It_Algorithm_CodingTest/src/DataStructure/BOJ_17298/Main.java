package DataStructure.BOJ_17298;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    /*
    첫번쨰 풀이 통과
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int[] val = new int[N];
//        int[] idx = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            val[i] = Integer.parseInt(st.nextToken());
//            idx[i] = i + 1;
//        }
//
//        idx[N - 1] = -1;
//        for (int i = N - 2; i >= 0; i--) {
//            int j = i + 1;
//            while(j >= 0 && j <= N-1 && val[i] >= val[j]) {
//                j = idx[j];
//            }
//            if(j == -1) {
//                idx[i] = -1;
//            } else {
//                idx[i] = j;
//            }
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        for (int i = 0; i < N; i++) {
//            if(idx[i] == -1) {
//                bw.write("-1 ");
//            } else {
//                bw.write(val[idx[i]] + " ");
//            }
//        }
//        bw.flush();
//        bw.close();
//    }

    /*
        두번째 풀이 통과
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] ret = new int[N];
        Deque<Integer> idx = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        idx.addLast(0);

        for(int i = 1; i<N;i++) {
            while(!idx.isEmpty() && arr[i] > arr[idx.getLast()]) {
                Integer last = idx.pollLast();
                ret[last] = arr[i];
            }
            idx.addLast(i);
        }

        while(!idx.isEmpty()) {
            Integer last = idx.pollLast();
            ret[last] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++) {
            bw.write(ret[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
