import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        br.close();

        int reverseA = (A / 100) + (((A / 10) % 10) * 10) + ((A % 10) * 100);
        int reverseB = (B / 100) + (((B / 10) % 10) * 10) + ((B % 10) * 100);

        if (reverseA > reverseB) System.out.println(reverseA);
        else System.out.println(reverseB);
    }
}