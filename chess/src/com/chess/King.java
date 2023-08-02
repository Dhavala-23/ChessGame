package com.chess;
public class King{
	private int srcX;
	private int srcY;
	private int destX;
	private int destY;
	private String color;
	public boolean validMoveKing(){
		if(color == "White" && destX-srcX < 0){
			return false;
		}
		if(color == "Black" && destX-srcX > 0){
			return false;
		}
		if(Math.abs(srcX-destX)==1 || Math.abs(srcY-destY)==1)
			return true;
		return false;
	}

}
