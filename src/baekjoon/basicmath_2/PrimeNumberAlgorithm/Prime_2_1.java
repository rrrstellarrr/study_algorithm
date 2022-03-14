package baekjoon.basicmath_2.PrimeNumberAlgorithm;

import java.util.Scanner;

/**
 * 소수를 판별하는 알고리즘 방법2
 * " √N 이하의 자연수들로 모두 나눠본다. "
 * 소수를 판별한다는 것은 결국 1 과 자기 자신을 제외한 다른 자연수를 약수로 갖고 있으면 안된다는 의미
 *
 */
public class Prime_2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        is_prime(sc.nextInt());

    }

    // 소수 판별 메소드
    public static void is_prime(int number) {

        // 0 과 1 은 소수가 아니다
        if(number < 2) {
            System.out.print("소수가 아닙니다");
            return;
        }

        // 2 는 소수다
        if(number == 2) {
            System.out.print("소수입니다");
            return;
        }

        System.out.println("제곱근 함수 : Math.sqrt() = " + Math.sqrt(number));

        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {

            // 소수가 아닐경우
            if(number % i == 0) {
                System.out.print("소수가 아닙니다");
                return;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        System.out.print("소수입니다");
        return;
    }
}
