package com.bilgeadam.boost.java.course01.lesson18;

import java.util.Arrays;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class Chess {

	public static void main(String[] args) {
		BAUtils.header("Atýn Hareketleri");
		int[][] moves = { { 2, 1 }, { 2, -1 }, { 1, 2 }, { 1, -2 }, { -2, 1 }, { -2, -1 }, { -1, 2 }, { -1, -2 } };

		do {
			String[][] board = initBoard();
			printBoard(board);
			
			Position pos = readPosition();
			board[pos.x][pos.y] = "AT";
			printBoard(board);
			
			board = calcPossiblePositions(pos, moves);
			
			System.out.println("\n\n");
			printBoard(board);
		} while (BAUtils.wantToEnd("Devam etmek ister misiniz?", "Hayýr"));
		
		BAUtils.footer();
	}

	private static String[][] calcPossiblePositions(Position position, int[][] moves) {
		String[][] retVal = initBoard();
		retVal[position.x][position.y] = "AT";
		
		for (int i = 0; i < moves.length; i++) {
			int[] possibleMove = moves[i];
			int posX = position.x + possibleMove[0];
			int posY = position.y + possibleMove[1];
			
			if ((posX >= 0 && posX <= 7) && (posY >= 0 && posY <= 7)) {
				retVal[posX][posY] = "XX";
			}
		}

		return retVal;
	}

	private static Position readPosition() {		
		Position retVal = new Position();
		boolean isInputCorrect;
		do {
			String inp = BAUtils.readString("Atýn pozisyonunu e4 gibi veriniz");
			inp = inp.toLowerCase();
			char ch = inp.charAt(0);
			int posX = ch - 'a';
			
			int posY = inp.charAt(1) - '1';
			isInputCorrect = false;
			if (posX >= 0 && posX <= 7)
				isInputCorrect = true;

			if (posY >= 0 && posY <= 7)
				isInputCorrect = isInputCorrect && true;

			retVal.x = posX;
			retVal.y = posY;
		} while (!isInputCorrect);

		return retVal;
	}

	private static void printBoard(String[][] board) {
		for (int i = 8; i > 0; i--) {
			for (char c = 'a'; c <= 'h'; c++) {
				System.out.print(board[c - 'a'][i - 1] + " ");
			}
			System.out.println();
		}
	}

	private static String[][] initBoard() {
		String[][] board = new String[8][8];
		for (int i = 8; i > 0; i--) {

			for (char c = 'a'; c <= 'h'; c++) {
				board[c - 'a'][i - 1] = (char) c + "" + i;
			}
		}
		return board;
	}

}
