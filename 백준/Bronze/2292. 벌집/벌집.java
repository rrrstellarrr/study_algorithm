import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
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