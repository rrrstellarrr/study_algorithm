import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int layer = 1;
        int count = 0;
        int total = 1;

        while(true) {
            if(N <= total) {
                break;
            }
            count += 6;
            total += count;
            layer++;
        }
        System.out.println(layer);
    }
}