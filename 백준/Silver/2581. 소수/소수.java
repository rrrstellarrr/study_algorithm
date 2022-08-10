import java.util.Scanner;

public class Main {

    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        isPrime();

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N + 1;

        for(int i = M; i <= N; i++) {
            if(!prime[i]) {
                if(min > i) {
                    min = i;
                }
                sum += i;
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

    public static void isPrime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(10000); i++) {
            for(int j = i * i; j < 10001; j += i) {
                prime[j] =true;
            }
        }
    }
}