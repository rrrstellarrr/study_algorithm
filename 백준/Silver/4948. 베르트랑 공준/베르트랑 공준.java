import java.util.Scanner;

public class Main {

    static boolean[] prime = new boolean[246913];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        isPrime();

        int n;
        while(true) {
            n = sc.nextInt();

            if(n == 0) {
                break;
            }

            int count = 0;
            for(int i = n + 1; i <= 2 * n; i++) {
                if(!prime[i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
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