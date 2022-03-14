package baekjoon.function_1;

import java.util.Scanner;

/**
 * 한수
 * 문제 : 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 출력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
public class no1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(count(sc.nextInt()));
    }

    // 입력 받은 수 보다 작거나 같은 한수의 개수를 셀 것
    public static int count(int num) {
        int cnt = 0;    // 한수 카운팅

        // 1 ~ 99 의 경우 그 수 자체가 수열
        if(num < 100) {
            return num;
        } else {    // 100 이상의 수들의 각 자릿수가 등차수열인지 확인
            cnt = 99;   // 100 이상의 수일 경우, 한수의 최소 개수는 99개이므로 99로 초기화

            if(num == 1000) {   // 예외처리
                num = 999;
            }

            for(int i = 100; i <= num; i++) {
                int hun = i / 100;  // 100의 자리 수
                int ten = (i / 10) % 10;    // 10의 자리 수
                int one = i % 10;   // 1의 자리 수

                if((hun - ten) == (ten - one)) {    // 각 자릿수가 수열을 이루는지 확인
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
