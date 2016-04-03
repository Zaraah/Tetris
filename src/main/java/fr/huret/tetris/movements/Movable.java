package fr.huret.tetris.movements;

public interface Movable {

	void goDown(MovementValidator movementValidator);

	void goRight(MovementValidator movementValidator);

	void goLeft(MovementValidator movementValidator);

	void turnLeft(MovementValidator movementValidator);

	void turnRight(MovementValidator movementValidator);

}
