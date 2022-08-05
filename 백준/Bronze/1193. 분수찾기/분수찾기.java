import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int line = 1;
        int count = 1;

        while(true) {
            X = X - line;
            if(X <= 0) {
                count = X + line;
                break;
            }
            line++;
        }
        if (line % 2 == 0) {
            System.out.println(count + "/" + (line - count + 1));
        } else {
            System.out.println((line - count + 1) + "/" + count);
        }
    }
}