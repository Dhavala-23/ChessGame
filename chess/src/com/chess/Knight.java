package com.chess;
public class Knight{
	private int srcX;
	private int srcY;
	private int destX;
	private int destY;
	private String color;
	public boolean validMoveKnight() {
		if (color == "White" && destX - srcX < 0) {
			return false;
		}
		if (color == "Black" && destX - srcX > 0) {
			return false;
		}
		if (Math.abs(srcX - destX) == 2 && Math.abs(srcY - destY) == 1) {
			return true;
		} else if (Math.abs(srcY - destY) == 2 && Math.abs(srcX - destX) == 1) {
			return true;
		}
		return false;
	}
}
