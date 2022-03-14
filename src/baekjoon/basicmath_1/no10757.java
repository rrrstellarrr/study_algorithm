package baekjoon.basicmath_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 큰 수 A+B
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
 * 출력 : 첫째 줄에 A+B를 출력한다.
 *
 *      예제 입력 1 : 9223372036854775807 9223372036854775808
 *      예제 출력 1 : 18446744073709551615
 */
public class no10757 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        A = A.add(B);

        System.out.println(A);
    }
}
