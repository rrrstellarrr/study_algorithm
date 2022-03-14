package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 베르트랑 공준
 * 문제 : 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
 *      예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
 *      자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
 *       입력의 마지막에는 0이 주어진다.
 * 출력 : 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
 *
 *      예제 입력 1 : 1                     예제 출력 1 : 1
 *                  10                               4
 *                  13                               3
 *                  100                              21
 *                  1000                             135
 *                  10000                            1033
 *                  100000                           8392
 *                  0
 */
public class no4948_2 {

    public static boolean[] prime = new boolean[246913];

    // 1 부터 누적하여 각 index 까지의 소수의 개수를 담을 배열
    public static int[] count_prime = new int[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime();
        get_count();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;	// n 이 0 일경우 종료

            // 2n 까지의 소수의 개수 - n 까지의 소수의 개수
            sb.append(count_prime[2 * n] - count_prime[n]).append("\n");
        }
        System.out.print(sb);
    }

    // 소수를 얻는 메소드
    public static void get_prime() {

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    // 소수의 개수를 얻는 메소드
    private static void get_count() {
        int count = 0;
        for(int i = 2; i < prime.length; i++) {
            if(!prime[i]) count++;

            // 0 ~ i 까지 소수의 개수 = count
            // count 값을 count_arr 의 i 에 저장한다
            count_prime[i] = count;
        }
    }

}
