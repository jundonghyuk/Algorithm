package DataStructure.BOJ_11720;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String sequence = scanner.next();
        char[] numbers = sequence.toCharArray();
        int sum = 0;
        for (char ch : numbers) {
            int value = ch - '0';
            sum += value;
        }
        System.out.println(sum);
    }
}
