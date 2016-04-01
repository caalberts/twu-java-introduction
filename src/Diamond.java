/**
 * Created by albert on 1/4/16.
 */
public class Diamond {
  public static void draw (int n) {
    int length = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        for (int j = 1; j <= (n - i) / 2; j++) {
          System.out.print(" ");
        }
        HorizontalLine.draw(i);
        length = i;
      }
    }
    for (int i = length-1; i >= 1; i--) {
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
