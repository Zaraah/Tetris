package fr.huret.tetris.inputReader;

import fr.huret.tetris.movements.Movement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

	//private static final int NO_MORE_AVAILABLE_INPUT = -2;
	private static final int NO_MORE_AVAILABLE_INPUT = 10;
	private static int readValue = 0;
	
	public List<Movement> getMovements(){
		List<Movement> result = new ArrayList<Movement>();
		//int readValue = 0;
		readValue = getReadValue();
		
		while(readValue != NO_MORE_AVAILABLE_INPUT){
			Movement movement = Movement.parseInput(readValue);
			result.add(movement);
			readValue = getReadValue(); 
		}
		
		return result;
	}
	
	private int getReadValue(){
		int readVal = 0;
		try {
			readVal = RawConsoleInput.read(false);
		} catch (IOException e) {
			throw new RuntimeException("impossible de lire le input canal",e);
			//e.printStackTrace();
		}
		return readVal;
		
	}
}
