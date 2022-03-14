package baekjoon.basicmath_2.PrimeNumberAlgorithm;

import java.util.Scanner;

/**
 * 소수를 판별하는 알고리즘 방법3 : 에라토스테네스의 체
 * 소수를 구하는 대표적인 방법 중 하나
 *
 * " k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
 *
 * k = 2 이면 2 를 제외한 2의 배수를 모두 지워주고,
 * k = 3 이면 3 을 제외한 3의 배수를 모두 지워주고,
 * (4는 이미 k = 2 에서 제외되어 넘어간다.)
 * k = 5 이면 5 를 제외한 5의 배수를 모두 지워주고..
 *
 * [ N 이하의 모든 소수를 구하는 알고리즘 ]
 */
public class Prime_3_1 {

    public static boolean[] prime;	// 소수를 체크할 배열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        make_prime(num);

        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == false) {    // 소수(false)일 경우 출력
                System.out.println(i);
            }
        }
    }

    // N 이하 소수 생성 메소드
    public static void make_prime(int number) {

        prime = new boolean[number + 1];	// 0 ~ number

		/*
		소수가 아닌 index = true
		소수인 index = false
		*/

        // 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
        if(number < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {

            // 이미 체크된 배열이면 다음 반복문으로 skip
            if(prime[i] == true) {
                continue;
            }

            // i 의 배수들을 걸러주기 위한 반복문
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

    }
}
