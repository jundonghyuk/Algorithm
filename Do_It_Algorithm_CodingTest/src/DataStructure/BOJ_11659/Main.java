package DataStructure.BOJ_11659;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int testCase = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            int number = sc.nextInt();
            if (i == 0) {
                list.add(number);
            } else {
                list.add(list.get(i - 1) + number);
            }
        }

        for (int i = 0; i < testCase; i++) {
            int prevIndex = sc.nextInt() - 1;
            int postIndex = sc.nextInt() - 1;
            if (prevIndex == 0) {
                System.out.println(list.get(postIndex));
            } else {
                System.out.println(list.get(postIndex) - list.get(prevIndex - 1));
            }
        }
    }
}
