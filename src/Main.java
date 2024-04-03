// Main class
public class Main {
  public static void main(String[] args) {
    Model model = new SnakeGameModel(10, 10); // Example board size
    View view = new SnakeGameView(System.out); // Output stream for drawing the board
    Controller controller = new Controller(model, view);

    
  }
}