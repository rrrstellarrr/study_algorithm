package baekjoon.for_statement;

import java.util.Scanner;

/**
 * 별 찍기 - 1
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 *      예제 입력 1 : 5
 *      예제 출력 1 : *
 *                  **
 *                  ***
 *                  ****
 *                  *****
 */
public class no2438 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i ; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
