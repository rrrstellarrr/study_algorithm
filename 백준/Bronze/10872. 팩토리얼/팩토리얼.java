import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(get_factorial(N));
    }

    public static int get_factorial(int N) {
        if(N <= 1) {
            return 1;
        }
        return N * get_factorial(N - 1);
    }
}