import java.io.OutputStream;

// Concrete View class
public class SnakeGameView implements View {
  private OutputStream outputStream;

  public SnakeGameView(OutputStream outputStream) {
    this.outputStream = outputStream;
  }

  @Override
  public void drawBoard(Board board) {
    // Draw the board to the output stream
  }
}


