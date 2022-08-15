import java.util.Scanner;

public class Main {

    public static int find(int startRow, int startCol, String[] board) {
        String[] chessBoard = {"WBWBWBWB", "BWBWBWBW"};

        int white = 0;

        for(int i = 0; i < 8; i++) {
            int row = startRow + i;

            for(int j = 0; j < 8; j++) {
                int col = startCol + j;
                if(board[row].charAt(col) != chessBoard[row % 2].charAt(j)) {
                    white++;
                }
            }
        }
        return Math.min(white, 64 - white);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] board = new String[N];

        for(int i = 0; i < N; i++) {
            board[i] = sc.next();
        }

        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i < N - 7; i++) {
            for(int j = 0; j < M - 7; j++) {
                int getCount = find(i, j, board);

                if(minCount > getCount) minCount = getCount;
            }
        }
        System.out.println(minCount);
    }
}