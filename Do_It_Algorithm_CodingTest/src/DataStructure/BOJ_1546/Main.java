package DataStructure.BOJ_1546;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int max = -1;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int number = sc.nextInt();
            list.add(number);
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        double d = (100.0) / max * sum;
        System.out.println(d / num);
    }
}
