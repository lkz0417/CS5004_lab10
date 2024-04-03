// Model Interface
public interface Model {
  void moveSnake(Direction direction);
  boolean isGameOver();


  Board getBoard();
}
