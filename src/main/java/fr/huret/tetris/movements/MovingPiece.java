package fr.huret.tetris.movements;

import fr.huret.tetris.pieces.*;
import fr.huret.tetris.movements.MovementValidator;

import java.util.Set;

public class MovingPiece implements Movable{
	private Tetromino tetromino = new Tetromino();
	private Position position = new Position();
	
	//public MovingPiece(){
		//this.position = position;
		//this.tetromino = tetromino;
	//}


	public void goDown(MovementValidator movementValidator) {
		Position newPosition = position.getUnderPosition(tetromino);
		//if(movementValidator.isValid(getNewPosition(tetromino,newPosition))){
			position = newPosition; //update de la position
		//}	
	}

	public void goRight(MovementValidator movementValidator) {
		Position newPosition = position.getRightPosition();
		if(movementValidator.isValid(getNewPosition(tetromino,newPosition))){
			position = newPosition; //update de la position
		}	
		
	}

	public void goLeft(MovementValidator movementValidator) {
		Position newPosition = position.getLeftPosition();
		//if(movementValidator.isValid(getNewPosition(tetromino,newPosition))){
			position = newPosition; //update de la position
		//}	
		
	}

	public void turnLeft(MovementValidator movementValidator) {
		Tetromino newTetromino = tetromino.getLeftTetromino();
		Position newPosition = position.getUnderPosition(tetromino);
		if(movementValidator.isValid(getNewPosition(newTetromino,newPosition))){
			position = newPosition; //update de la position
			tetromino = newTetromino;
		}	
		
	}

	public void turnRight(MovementValidator movementValidator) {
		Tetromino newTetromino = tetromino.getRightTetromino();
		Position newPosition = position.getUnderPosition(tetromino);
		if(movementValidator.isValid(getNewPosition(newTetromino,newPosition))){
			position = newPosition; //update de la position
			tetromino = newTetromino;
		}
		
	}
	
	
	private Set<Position> getNewPosition(Tetromino tetromino, Position Position){
		
		// TODO
		return null;
	}
	
	
}
