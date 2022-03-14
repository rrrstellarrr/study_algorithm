package baekjoon.string_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 합
 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 압려 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
 */
public class no11720 {

    public static void main(String[] args) throws IOException {
        // 방법1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        for(byte num : br.readLine().getBytes()) {
            sum += (num - '0');
        }
        System.out.println(sum);

        // 방법2
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        sum = 0;

        for(int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
