package tracer;

import javafx.scene.paint.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaytracerTest {

  private Raytracer raytracer = new Raytracer();

  @Test
  public void getColor() {
    assertEquals(Color.BLACK, raytracer.getColor(0,0));
    assertEquals(Color.BLACK, raytracer.getColor(10,0));
    assertEquals(Color.BLACK, raytracer.getColor(0,10));
    assertEquals(Color.BLACK, raytracer.getColor(42,42));
  }
}
