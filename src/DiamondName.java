/**
 * Created by albert on 1/4/16.
 */
public class DiamondName {
  public static void draw (int n, String name) {
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        for (int j = 1; j <= (n - i) / 2; j++) {
          System.out.print(" ");
        }
        HorizontalLine.draw(i);
      }
    }
    System.out.print(name);
    for (int i = n; i >= 1; i--) {
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
