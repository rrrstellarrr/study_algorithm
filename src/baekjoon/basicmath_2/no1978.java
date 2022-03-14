package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 찾기
 * 문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 출력 : 주어진 수들 중 소수의 개수를 출력한다.
 *
 *      예제 입력 1 : 4
 *                 1 3 5 7
 *      예제 출력 1 : 3
 */
public class no1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            boolean isPrime = true;     // 소수 : true, 나머지 : false

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) {
                continue;
            }
            for(int j = 2; j <= Math.sqrt(num); j++) {  // double타입의 제곱근 값을 리턴
                if(num % j == 0) {
                    isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
                    break;
                }
            }
            if(isPrime) cnt++;
        }

        System.out.println(cnt);
    }
}
