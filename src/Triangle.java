/**
 * Created by albert on 1/4/16.
 */
public class Triangle {
  public static void draw (int n) {
    for (int i = 1; i <= n; i++) {
      HorizontalLine.draw(i);
    }
    System.out.print("\n");
  }

}
