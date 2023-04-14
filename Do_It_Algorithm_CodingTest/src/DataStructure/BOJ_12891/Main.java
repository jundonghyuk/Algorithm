package DataStructure.BOJ_12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String seq = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int[] req = new int[4];

        for (int i = 0; i < 4; i++) {
            // A C G T
            req[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr = new int[4];
        for (int j = 0; j < P; j++) {
            if (seq.charAt(j) == 'A') {
                arr[0]++;
            } else if (seq.charAt(j) == 'C') {
                arr[1]++;
            } else if (seq.charAt(j) == 'G') {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }

        int startIdx = 0;
        int endIdx = P - 1;
        int cnt = 0;
        while (endIdx < S) {
            boolean match = true;
            for (int k = 0; k < 4; k++) {
                if (req[k] > arr[k]) {
                    match = false;
                    break;
                }
            }
            if(match) {
                cnt++;
            }


            if (seq.charAt(startIdx) == 'A') {
                arr[0]--;
            } else if (seq.charAt(startIdx) == 'C') {
                arr[1]--;
            } else if (seq.charAt(startIdx) == 'G') {
                arr[2]--;
            } else {
                arr[3]--;
            }
            startIdx++;
            endIdx++;
            if(endIdx == S) {
                break;
            }
            if (seq.charAt(endIdx) == 'A') {
                arr[0]++;
            } else if (seq.charAt(endIdx) == 'C') {
                arr[1]++;
            } else if (seq.charAt(endIdx) == 'G') {
                arr[2]++;
            } else {
                arr[3]++;
            }

        }
        System.out.println(cnt);
    }
}
