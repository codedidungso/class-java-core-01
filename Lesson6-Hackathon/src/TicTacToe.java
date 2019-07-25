import java.util.Scanner;

public class TicTacToe { // filename = TicTacToe.java
	static int x, y;
	static int[][] board = new int[3][3];

	public static void main(String[] args) {
		int player = 1;
		int count = 0;
		while (true) {
			System.out.println("Player " + player + "'s turn: ");
			input();
			while (check() == false) { // !check()
				System.out.println("Sai roi, input lai!");
				input();
			}
			put(player);
			printBoard();
			if(checkWin(player)) break;
			if (++count > 8) {
				System.out.println("Draw!");
				break;
			}
			player = 3 - player; // 1 = 3 - 2, 2 = 3 - 1
		}
	}

	private static boolean checkWin(int player) { 
		if (board[0][y] != 0 && board[0][y] == board[1][y] && board[1][y] == board[2][y]) {
			System.out.println("Player " + player + " win!");
			return true;
		}
		if (board[x][0] != 0 && board[x][0] == board[x][1] && board[x][1] == board[x][2]) {
			System.out.println("Player " + player + " win!");
			return true;
		}
		if (board[0][0] != 0 && board[1][1] == board[0][0] && board[2][2] == board[0][0]) {
			System.out.println("Player " + player + " win!");
			return true;
		}
		if (board[0][2] != 0 && board[1][1] == board[0][2] && board[1][1] == board[2][0]) {
			System.out.println("Player " + player + " win!");
			return true;
		}
		return false;
	}

	private static void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	private static void put(int player) {
		board[x][y] = player;
	}

	private static boolean check() {
		if (x < 0 || x > 2)
			return false; // [0,1,2]
		if (y < 0 || y > 2)
			return false; // [0,1,2]
		if (board[x][y] == 0)
			return true;
		return false;
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x = sc.nextInt();
		System.out.print("Nhap y: ");
		y = sc.nextInt();
	}
}