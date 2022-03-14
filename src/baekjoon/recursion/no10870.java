package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 5
 * 문제 : 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 *      이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 *      n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 * 출력 : 첫째 줄에 n번째 피보나치 수를 출력한다.
 */
public class no10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(get_fibonacci(n));
    }

    private static int get_fibonacci(int n) {
        if(n <= 1) {
            return 1;
        }

        return n + get_fibonacci(n - 1);
    }
}
