import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] fibonacci = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            if(i == 0 || i == 1) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        System.out.println(fibonacci[n]);
    }
}