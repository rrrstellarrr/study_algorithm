package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 골드바흐의 추측
 * 문제 : 1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
 *      골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다.
 *      또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
 *      예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
 *      2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
 * 출력 : 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
 *
 *      예제 입력 1 : 3             예제 출력 1 : 3 5
 *                  8                        5 5
 *                  10                       5 11
 *                  16
 */
public class no9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            sb.append(get_gold(n)).append("\n");
        }
        System.out.print(sb);
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;

            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    /**
     * n = p + q ( p 와 q는 소수 ) 일 때,
     *
     * 예로들어 n = 16 알때,
     * 일단 p 와 q 에 16을 절반으로 나눈 8 을 각각 저장한다고 가정.
     * 그리고 p 와 q 가 소수가 아니라면 p 는 1 감소, q 는 1 증가시키면서 p 와 q 가 소수일 때 까지 찾는다.
     */
    public static String get_gold(int n) {

        int p = n / 2;
        int q = n / 2;

        while (true) {
            if(!prime[p] && !prime[q]) {
                return p + " " + q;
            }
            p--;
            q++;
        }
    }

}
