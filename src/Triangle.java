/**
 * Created by albert on 1/4/16.
 */
public class Triangle {
  public void drawAsterisk () {
    System.out.println("*");
  }

  public static void drawHorizontalLine (int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
    System.out.print("\n");
  }

  public static void drawVerticalLine (int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("*");
    }
  }

  public static void drawTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      drawHorizontalLine(i);
    }
  }

}
