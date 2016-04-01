/**
 * Created by albert on 1/4/16.
 */
public class VerticalLine {
  public static void draw (int n) {
    for (int i = 0; i < n; i++) {
      Asterisk.draw();
      System.out.print("\n");
    }
  }
}
