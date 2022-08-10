import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(get_factorial(N));
    }

    public static int get_factorial(int N) {
        if(N <= 1) {
            return 1;
        }
        return N * get_factorial(N - 1);
    }
}