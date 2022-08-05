import java.util.Scanner;

public class Main {

    static int[] arr = new int[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        initialization();

        String S = sc.nextLine();
        indexCheck(S);

        for(int result : arr) {
            sb.append(result).append(" ");
        }
        System.out.print(sb);
    }

    private static void initialization() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
    }

    private static void indexCheck(String S) {
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
    }
}