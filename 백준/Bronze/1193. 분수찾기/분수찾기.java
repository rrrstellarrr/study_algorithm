import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int line = 0;
        int count = 0;

        while(count < X) {
            line++;
            count = (line * (line + 1)) / 2;
        }

        if (line % 2 == 0) {
            System.out.println((X - count + line) + "/" + (count - X + 1));
        } else {
            System.out.println((count - X + 1) + "/" + (X - count + line));
        }
    }
}