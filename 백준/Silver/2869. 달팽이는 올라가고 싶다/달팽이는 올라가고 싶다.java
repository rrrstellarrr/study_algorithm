import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double V = Double.parseDouble(st.nextToken());

        int day = (int) Math.ceil((V - B) / (A - B));

        System.out.println(day);
    }
}