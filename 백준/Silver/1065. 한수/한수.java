import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println(counting(number));
    }

    public static int counting(int number) {
        int cnt = 0;

        if(number < 100) return  number;
        else {
            cnt = 99;

            for(int i = 100; i <= number; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if((a - b) == (b - c)) cnt++;
            }
        }
        return cnt;
    }
}