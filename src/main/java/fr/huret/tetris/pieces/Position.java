package fr.huret.tetris.pieces;


public class Position {

	private int[][] positionArray;
	private int i = 0;
	private int j = 0;
	
	public Position(){
		
	}
	
	public Position getUnderPosition(Tetromino tetromino) {
		//TODO (le return this sert seulement a empecher la nullPointerException)
		return this;
	}

	public Position getRightPosition() {
		return null;
	}

	public Position getLeftPosition() {
		// TODO (idem getUndrePosition)
		return this;
	}

}
