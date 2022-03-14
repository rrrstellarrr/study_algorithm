package baekjoon.function_1;

import java.util.Scanner;

/**
 * 정수 N개의 합
 * 문제 : 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 *
 */
public class no15596 {

    static int[] a = new int[3000000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(sum(a));
    }

    public static long sum(int[] a) {   // a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum; // 리턴값: a에 포함되어 있는 정수 n개의 합
    }
}
