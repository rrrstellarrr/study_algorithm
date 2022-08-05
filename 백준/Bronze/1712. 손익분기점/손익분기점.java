import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // nC = A + nB
        // => nC - nB = A
        // => n(C - B) = A
        // => n = A / (C - B)
        if(C <= B) {
            System.out.println(-1);
        } else {
            System.out.println((A / (C - B)) + 1);
        }
    }
}