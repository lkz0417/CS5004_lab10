// Concrete Model class
public class SnakeGameModel implements Model {
  private Board board;
  private Snake snake;
  private boolean gameOver;

  public SnakeGameModel(int width, int height) {
    this.board = new Board(width, height);
    this.snake = new Snake();
    this.gameOver = false;
  }

  @Override
  public void moveSnake(Direction direction) {
    // Move the snake based on the direction
    // Check for collision with walls or itself
    // Update game state accordingly
  }

  @Override
  public boolean isGameOver() {
    return gameOver;
  }

  public Board getBoard() {
    return board;
  }
}

