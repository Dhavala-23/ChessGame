package com.chess;

public class Bishop{
	private int srcX;
	private int srcY;
	private int destX;
	private int destY;
	private String color;
	InitializeBoard display = new InitializeBoard();
	public boolean validMoveBishop(){
		if(color == "White" && destX-srcX < 0){
			return false;
		}
		if(color == "Black" && destX-srcX > 0){
			return false;
		}
		if((srcX==destX && srcY!=destY)
				|| (srcY==destY && srcX!=destX)
				|| Math.abs(srcX-destX)==Math.abs(srcY-destY)) {
			return checkMiddlePieces(srcX,srcY,destX,destY);
		}
		return true;
	}
	public boolean checkMiddlePieces(int srcX, int srcY, int destX, int destY) {
		if(srcX==destX && srcY!=destY) {
			for(int i=srcY+1;i<destY;i++) {
				if(display.board[destX][i]!=" ")
					return false;
			}
		}
		else if(srcX!=destX && srcY==destY) {
			for(int i=srcX+1;i<destX;i++) {
				if(display.board[i][destY]!=" ")
					return false;
			}
		}
		else if(Math.abs(srcX-destX)==Math.abs(srcY-destY)) {
			for(int i=srcX+1,j=srcY+1;i<destX && j<destY;i++,j++) {
				if(display.board[i][destY]!=" ")
					return false;
			}
		}
		return true;
	}

}