import java.util.Scanner;

public class Main {

    static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int M = sc.nextInt();
        int N = sc.nextInt();

        prime = new boolean[N + 1];
        isPrime();

        for(int i = M; i <= N; i++) {
            if(!prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void isPrime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}