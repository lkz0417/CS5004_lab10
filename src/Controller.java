// Controller
public class Controller {
  private Model model;
  private View view;

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  public void handleInput(Direction direction) {
    model.moveSnake(direction);
    view.drawBoard(model.getBoard());
    if (model.isGameOver()) {
      // Handle game over
    }
  }
}


