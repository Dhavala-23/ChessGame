package com.chess;

public class Main {
    public static void main(String[] args) {

        InitializeBoard display = new InitializeBoard();
        display.fillBoard();
        display.presentBoard();
        boolean loop = true;
        Player p1 = new Player();

        Player p2 = new Player();

        while(loop){
            p1.player1();
            p2.player2();
            display.presentBoard();
        }

    }
}
