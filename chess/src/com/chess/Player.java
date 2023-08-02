package com.chess;
import java.io.*;
import java.util.LinkedList;

public class Player {
	InitializeBoard display = new InitializeBoard();
	LinkedList<String> p1 = new LinkedList<>();
	LinkedList<String> p2 = new LinkedList<>();
	private static FileReader fileReader;
	private static FileWriter fileWriter;
	private static BufferedReader bufferedReader;
	private static BufferedWriter bufferedWriter;
	private static PrintWriter writer;
	public static File file = new File("log.txt");

	public void FileOperation() throws IOException {
		fileReader = new FileReader(file);
		fileWriter = new FileWriter(file, true);
		bufferedReader = new BufferedReader(fileReader);
		bufferedWriter = new BufferedWriter(fileWriter);
	}

	public void player1() {
		System.out.println("Player-1:");
		String[] temp = display.move();
		String msg = "Player1 moved " + temp[0] + " from " + temp[1] + " to " + temp[2];
		p1.add(msg);
		System.out.println(msg);
		//public static void writeFile() {
		try{
			FileWriter fstream = new FileWriter("log.txt",true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(msg+" " + new java.util.Date()+"\n");
			out.close();
		}catch (Exception e){
			System.err.println("Error while writing to file: " +
					e.getMessage());
		}
	}

	public void player2(){
			System.out.println("Player-2:");
			String[] temp = display.move();
			String msg="Player2 moved "+temp[0]+" from "+temp[1]+" to "+temp[2];
			p1.add(msg);
			System.out.println(msg);
		try{
			FileWriter fstream = new FileWriter("log.txt",true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(msg+" " + new java.util.Date()+"\n");
			out.close();
		}catch (Exception e){
			System.err.println("Error while writing to file: " +
					e.getMessage());
		}
	}

}