package fr.huret.tetris.movements;

public enum Movement {
	
	DOWN('s') {
		@Override
		public void move(MovementValidator movementValidator, Movable movable) {
			movable.goDown(movementValidator);
		}
	},
	RIGHT('d') {
		@Override
		public void move(MovementValidator movementValidator, Movable movable) {
			movable.goRight(movementValidator);	
		}
	},
	LEFT('q') {
		@Override
		public void move(MovementValidator movementValidator, Movable movable) {
			movable.goLeft(movementValidator);
		}
	},
	TURNLEFT('a') {
		@Override
		public void move(MovementValidator movementValidator, Movable movable) {
			movable.turnLeft(movementValidator);
		}
	},
	TURNRIGHT('e') {
		@Override
		public void move(MovementValidator movementValidator, Movable movable) {
			movable.turnRight(movementValidator);
		}
	},
	NONE('*') {
		@Override
		public void move(MovementValidator movementValidator, Movable ignore) {			
		}
	}; //mouvement par defaut
	
	private final char key;
	
	Movement(char c){
		this.key = c;	
	}

	public static Movement parseInput(int readValue) {
		for (Movement movement : Movement.values()){ 
			if(movement.key == readValue) {
				return movement;
			}
		}
		return NONE; 
	}

	public abstract void move(MovementValidator movementValidator, Movable movable);
	
}
