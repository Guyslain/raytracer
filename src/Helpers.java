public class Helpers {

  public static final double EPSILON = 1e-9;

  static int compareDouble(double d1, double d2) {
    if (Math.abs(d1) < EPSILON) {
      return d2 > EPSILON ? -1 :
             d2 < -EPSILON ? 1 :
             0;
    };
    return d2 / d1 - 1 > EPSILON ? -1 :
           d1 / d2 - 1> EPSILON ? 1 :
           0;
  }


}
