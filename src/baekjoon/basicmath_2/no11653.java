package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소인수분해
 * 문제 : 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
 * 출력 : N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
 */
public class no11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        /*
         * 임의의 정수 N에 대하여 곱셈으로 분해하면
         * 제곱근을 기준으로 대칭이 된다.
         * 예로들어 9에 대하여 곱으로 표현하면
         * 1 * 9, 3 * 3, 9 * 1 이런식으로 말이다.
         * 즉, i * i 가 N 이하일 때 까지만 탐색해도 된다.
         */
        for(int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }
        if(N != 1) {
            sb.append(N);
        }

        System.out.print(sb);
    }
}
