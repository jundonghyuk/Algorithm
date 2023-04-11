package DataStructure.BOJ_2018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int startIdx = 1;
        int endIdx = 1;
        int ret = 1; // num
        int sum = 1;
        while (endIdx != num) {
            if (sum > num) {
                startIdx++;
                sum = sum - startIdx + 1;
            } else if (sum < num) {
                endIdx++;
                sum = sum + endIdx;
            } else {
                ret++;
                endIdx++;
                sum = sum + endIdx;
            }
        }
        System.out.println(ret);
    }
}
