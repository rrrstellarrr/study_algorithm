import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int total = 1;
        int layer = 1;

        while(N > total) {
            total += 6 * layer;
            layer++;
        }
        System.out.println(layer);
    }
}