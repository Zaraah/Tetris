package fr.huret.tetris.pieces;

import java.util.Set;

public class Tetromino {

	private int orientation = 0;
	private int shape = 0;
	private int [][][] I = { {{0,0,0,0},{1,1,1,1},{0,0,0,0},{0,0,0,0}}, {{0,0,1,0},{0,0,1,0},{0,0,1,0},{0,0,1,0}}, {{0,0,0,0},{1,1,1,1},{0,0,0,0},{0,0,0,0}}, {{0,0,1,0},{0,0,1,0},{0,0,1,0},{0,0,1,0}} };
	private int [][][] O = { {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}}, {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}}, {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}}, {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}} };
	private int [][][][] availableTetrominos = { I,O };
	private int [][] chosenTetromino;
	private int rand;
	private int positionX;
	private int positionY;
	
	public Tetromino(){
		
		rand = (int) (Math.random()*4);
		this.orientation = rand;
		rand = (int) (Math.random()*2);
		this.shape = rand;
		this.chosenTetromino = availableTetrominos[shape][orientation];
		this.positionX = 3;
		this.positionY = -4;
	}
	
	public int[][] getRelativeTetromino(){
		return chosenTetromino;
	}
	
	public Tetromino getLeftTetromino() {
		this.orientation = (orientation - 1)%4 ;
		this.chosenTetromino = availableTetrominos[shape][orientation];
		return this;
	}
	
	public Tetromino getRightTetromino() {
		return null;
	}

	/*Set<Position> getRelativePosition() {
		return null;
	}*/
	
	
	
}
