import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N + 1;

        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                sum += i;
                if(i < min) {
                    min = i;
                }
            }
        }
        if(sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n");
            sb.append(min);
        }

        System.out.print(sb);
    }

    public static boolean isPrime(int num) {

        if(num == 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}