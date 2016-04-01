/**
 * Created by albert on 1/4/16.
 */

public class Main {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    Triangle a = new Triangle();

    Triangle.drawHorizontalLine(n);
    System.out.println();
    Triangle.drawVerticalLine(n);
    System.out.println();
    Triangle.drawTriangle(n);
  }
}
