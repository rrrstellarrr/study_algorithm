package baekjoon.basicmath_2.PrimeNumberAlgorithm;

import java.util.Scanner;

/**
 * 소수를 판별하는 알고리즘 방법2
 * " √N 이하의 자연수들로 모두 나눠본다. "
 * 소수를 판별한다는 것은 결국 1 과 자기 자신을 제외한 다른 자연수를 약수로 갖고 있으면 안된다는 의미
 * [ N 이하의 모든 소수 구하는 알고리즘 ]
 */
public class Prime_2_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 0 ~ N 까지 수 중 소수를 구하는 반복문
        for(int i = 0; i <= num; i++) {
            make_prime(i);
        }

    }

    // 소수 판별 메소드
    // 소수 판별 알고리즘을 N 번 반복하여 각 수마다 소수 판별 한 뒤 소수만 출력하도록 한 알고리즘
    public static void make_prime(int number) {

        // 0 과 1 은 소수가 아니므로 종료
        if(number < 2) {
            return;
        }

        // 2 는 소수다
        if(number == 2) {
            System.out.println(number);
            return;
        }


        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {

            // 소수가 아닐경우 종료
            if(number % i == 0) {
                return;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        System.out.println(number);
        return;
    }
}
