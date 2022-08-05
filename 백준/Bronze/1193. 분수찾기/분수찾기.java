import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
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