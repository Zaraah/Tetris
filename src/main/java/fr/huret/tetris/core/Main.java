package fr.huret.tetris.core;

import fr.huret.tetris.printer.Printer;
import fr.huret.tetris.inputReader.*;

public class Main {

	public static void main(String[] args) {
		InputReader inputReader = new InputReader();
		GameBoard gameBoard = new GameBoard();
		Printer printer = new Printer();
		
		TetrisCore tetrisCore = new TetrisCore(inputReader, gameBoard, printer); 
		tetrisCore.run();

	}

}
