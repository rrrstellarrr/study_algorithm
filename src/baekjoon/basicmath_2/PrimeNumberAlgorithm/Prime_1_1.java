package baekjoon.basicmath_2.PrimeNumberAlgorithm;

import java.util.Scanner;

/**
 * 소수를 판별하는 알고리즘 방법1
 * " N 보다 작은 자연수들로 모두 나눠본다. "
 * 임의의 수 N 이 1 과 N 을 제외한 다른 수를 약수로 갖고 있다면 그 수는 소수가 아니고, 만약 다른 약수가 없다면 그 수는 소수일 것이다.
 *  시간복잡도 : O(N)
 */
public class Prime_1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        is_prime(sc.nextInt());
    }

    // [ 소수 판별 알고리즘 ]
    // 2 이상 N 미만의 수 중에 나누어 떨어지는 수가 존재한다면 소수가 아님을 이용한 소수 판별법
    private static void is_prime(int number) {

        // 0과 1은 소수가 아니다
        if(number < 2) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        // 2 는 소수다
        if(number == 2) {
            System.out.println("소수입니다");
            return;
        }

        for(int i = 2; i < number; i++) {

            // 소수가 아닐경우
            if(number % i == 0) {
                System.out.println("소수가 아닙니다");
                return;
            }
        }

        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        System.out.println("소수입니다");
        return;
    }
}
