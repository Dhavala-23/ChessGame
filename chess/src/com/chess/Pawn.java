package com.chess;
public class Pawn{
	private int srcX;
	private int srcY;
	private int destX;
	private int destY;
	private String color;
	public boolean validMovePawn(){
		if(color == "White" && destX-srcX < 0){
			return false;
		}
		if(color == "Black" && destX-srcX > 0){
			return false;
		}
		if(((srcX==1 || srcX==6) && (Math.abs(destX-srcX)==2))
				|| ((srcX!=1 || srcX!=6) && (Math.abs(destX-srcX)==1))
				&& srcY==destY) {
			return true;
		}
		if(Math.abs(srcY-destY)==1) {
			return true;
		}
		if(Math.abs(srcX-destX)==1 && Math.abs(srcY-destY)==1) {
			return true;
		}
		return false;
	}

}
