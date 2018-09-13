package viewer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import tracer.Raytracer;

import java.net.URL;
import java.util.ResourceBundle;

public class Renderer implements Initializable {

  private void render() {
    int width = (int) canvas.getWidth();
    int height = (int) canvas.getHeight();
    GraphicsContext context = canvas.getGraphicsContext2D();
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        renderPixel(context,x,y);
      }
    }
  }

  private void renderPixel(GraphicsContext context, int x, int y) {
    Paint paint = raytracer.getColor(x,y);
    context.setFill(paint);
    context.fillRect((double) x, (double) y, 1, 1);
  }


  private Raytracer raytracer = new Raytracer();

  @FXML
  private Canvas canvas;


  @Override
  public void initialize(URL location, ResourceBundle resources) {
    canvas.setHeight(Main.IMAGE_HEIGHT);
    canvas.setWidth(Main.IMAGE_WIDTH);
    render();
  }
}
