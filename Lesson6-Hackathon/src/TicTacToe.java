import java.util.Scanner;

public class TicTacToe {
	static Scanner sc = new Scanner(System.in);
	static int[][] board = new int[3][3];
	static int count = 0;

	public static void main(String[] args) {
		int x, y;

		while (true) {
			printBoard(); // print board
			System.out.print("P1: "); // input x y coordinate  
			while (true) {
				x = sc.nextInt();
				y = sc.nextInt();
				if (Move(x - 1, y - 1, 1)) // if move success, continue to next turn else repeat 
					break;
			}
			count++; // count number of moves. if there are 9 moves => draw 
			if (count == 9)
				break;
			// == //
			printBoard();
			System.out.print("P2: ");
			while (true) {
				x = sc.nextInt();
				y = sc.nextInt();
				if (Move(x - 1, y - 1, 2))
					break;
			}
			count++;
			if (count == 9)
				break;
		}
		System.out.println("Draw!");
	}

	private static boolean Move(int x, int y, int i) {
		if (board[x][y] == 0) { //  0 => available to move 
			board[x][y] = i; // flagged that player i move here 
		} else {
			System.out.print("P" + i + " wrong move! Again: "); 
			return false;
		}
		// check all win conditions 
		if ((board[x][0] == board[x][1] && board[x][2] == board[x][1]) 
				|| (board[0][y] == board[1][y] && board[1][y] == board[2][y])
				|| (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != 0)
				|| (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != 0))

		{
			printBoard();
			System.out.println("P" + i + " win");
			System.exit(i);
		}
		return true;

	}

	// print the current board 
	static void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0)
					System.out.print(" .");
				if (board[i][j] == 1)
					System.out.print(" x");
				if (board[i][j] == 2)
					System.out.print(" o");
			}
			System.out.println();
		}

	}
}
