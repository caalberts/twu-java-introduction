/**
 * Created by albert on 1/4/16.
 */
public class IsoscelesTriangle {
  public static void draw (int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        for (int j = 1; j <= (n - i) / 2; j++) {
          System.out.print(" ");
        }
        HorizontalLine.draw(i);
      }
    }
    System.out.print("\n");
  }
}
