/**
 * Created by albert on 1/4/16.
 */

public class Main {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    HorizontalLine.draw(n);
    System.out.print("\n");
    VerticalLine.draw(n);
    System.out.print("\n");
    Triangle.draw(n);
    System.out.print("\n");
    IsoscelesTriangle.draw(n);
    System.out.print("\n");
    Diamond.draw(n);

  }
}
