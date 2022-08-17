import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        StringBuilder sb = new StringBuilder();

        int[] count = new int[10];

        int num;
        while((num = input.read()) != '\n') {
            count[num - '0']++;
        }

        for(int i = 9; i >= 0; i--) {
            while(count[i]-- > 0) sb.append(i);
        }
        System.out.print(sb);
    }
}