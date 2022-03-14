package baekjoon.basicmath_2.PrimeNumberAlgorithm;

import java.util.Scanner;

/**
 * 소수를 판별하는 알고리즘 방법1
 * 소수 판별 알고리즘을 N 번 반복하여 각 수마다 소수 판별 한 뒤 소수만 출력하도록 한 알고리즘
 *  시간복잡도 : O(N)
 *
 *  [ N 이하의 모든 소수 구하는 알고리즘 ]
 */
public class Prime_1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i <= num; i++) {
            make_prime(i);
        }
    }

    // N 이하의 소수를 모두 구하는 알고리즘
    private static void make_prime(int number) {

        // 0과 1은 소수가 아니다
        if(number < 2) {
            return;
        }

        // 2 는 소수다
        if(number == 2) {
            System.out.print(number + " ");
            return;
        }

        for(int i = 2; i < number; i++) {

            // 소수가 아닐경우
            if(number % i == 0) {
                return;
            }
        }

        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        System.out.print(number + " ");
        return;
    }
}
