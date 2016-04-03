package fr.huret.tetris.core;

import fr.huret.tetris.movements.Movement;
import fr.huret.tetris.printer.*;
import fr.huret.tetris.inputReader.*;

import java.util.List;
//import java.io.IOException;

public class TetrisCore {
	private final InputReader inputReader;
	private final GameBoard gameBoard;
	private final Printer printer;
	
	public TetrisCore(InputReader ir, GameBoard g, Printer pt){
		this.inputReader = ir;
		this.gameBoard = g;
		this.printer = pt;
		
	}
	
	public void run(){
		System.out.println("hello");
		gameBoard.init();
		while(gameBoard.isNotLost()){ // on joue tant que la partie n'est pas perdue
			
			List<Movement> movements = inputReader.getMovements();
			movements.add(Movement.DOWN); //mvt auto vers le bas
			gameBoard.applyMovements(movements);
			System.out.println(movements);
			printer.print(gameBoard);
		}
	}
	
	
}
