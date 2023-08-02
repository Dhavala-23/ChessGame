package com.chess;

import java.util.*;
public class InitializeBoard {
	public static String[][] board = new String[8][8];

	public static void fillBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = " ";
			}
		}
		// Rooks
		board [0][0] = "BR";
		board [0][7] = "BR";
		board [7][0] = "WR";
		board [7][7] = "WR";

		// Knights
		board [0][1] = "BN";
		board [0][6] = "BN";
		board [7][1] = "WN";
		board [7][6] = "WN";

		//Bishops
		board [0][2] = "BB";
		board [0][5] = "BB";
		board [7][2] = "WB";
		board [7][5] = "WB";

		//Queens
		board [0][3] = "BQ";
		board [7][3] = "WQ";

		//Kings
		board [0][4] = "BK";
		board [7][4] = "WK";

		//Pawns
		for (int i = 0; i < 8; i++) {
			board[1][i] = "BP";
			board[6][i] = "WP";
		}
	}
	static int convertChar(String a){
		String alphabet = "abcdefgh";
		char input = a.charAt(0);
		int n=alphabet.indexOf(input);
		return n;
	}
	static String getDetails(String position){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Position");
		position = s.nextLine();
		if(position.equals("print")){
			presentBoard();
			System.exit(0);
		}
		if(position.equals("exit")){
			System.exit(0);
		}

		return position;
	}

	static String[] findPieceDetails(){
		String pos = new String();
		pos=getDetails(pos);
		String[] temp = new String[5];
		temp[1]=pos;
		int x =  Integer.parseInt(String.valueOf(pos.charAt(1)));
		int y = convertChar(pos);
		String val = board[x][y];
		String l1= String.valueOf(val.charAt(0));
		String l2 = String.valueOf(val.charAt(1));
		String l3 = new String();
		switch (l2){
			case "P":
				l3="Pawn";
				break;
			case "K":
				l3="King";
				break;
			case "Q":
				l3="Queen";
				break;
			case "N":
				l3="Knight";
				break;
			case "R":
				l3="Rook";
				break;
		}
		if(l1.equals("B")){
			temp[0]="Black "+l3;
			System.out.println("Black "+l3);
		}
		else if(l1.equals("W")){
			temp[0]="White "+l3;
			System.out.println("White "+l3);
		}
		temp[2]=Integer.toString(x);
		temp[3]=Integer.toString(y);
		return temp;
	}

	static String[] move() {
		int[] from = new int[2];
		int[] to = new int[2];
		String[] temp = findPieceDetails();
		from[0]= Integer.parseInt(temp[2]);
		from[1]= Integer.parseInt(temp[3]);
		String toPos=new String();
		toPos = getDetails(toPos);
		to[0]= Integer.parseInt(String.valueOf(toPos.charAt(1)));
		to[1]= convertChar(toPos);
		board[to[0]][to[1]] = board[from[0]][from[1]];
		board[from[0]][from[1]]=" ";
		temp[2]=toPos;
		temp[3]="";
		return temp;
	}

	public static void presentBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
