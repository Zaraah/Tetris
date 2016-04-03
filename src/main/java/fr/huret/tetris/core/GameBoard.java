package fr.huret.tetris.core;

import fr.huret.tetris.movements.*;
import fr.huret.tetris.printer.Printable;

import java.util.List;


public class GameBoard implements Printable{

	private boolean lost = false;
	private MovingPiece movingPiece = new MovingPiece();
	private MovementValidator movementValidator;
	
	public boolean isNotLost() {
		return !lost;
	}

	
	public void applyMovements(List<Movement> movements) {
		
		for (Movement movement : movements){
			movement.move(movementValidator, movingPiece);
		}
		System.out.println("movements applied");
	}


	public void init() {
		System.out.println("game initialized");
		
	}
	
	
	private void choosePiece(){
		
		
		
	}
	
	
}
