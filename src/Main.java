/**
 * Created by albert on 1/4/16.
 */

public class Main {
  public static void main(String[] args) {

    int n = Integer.parseInt(args[1]);
    String name = args[2];


    HorizontalLine.draw(n);
    System.out.print("\n");
    VerticalLine.draw(n);
    System.out.print("\n");
    Triangle.draw(n);
    System.out.print("\n");
    IsoscelesTriangle.draw(n);
    System.out.print("\n");
    Diamond.draw(n);
    System.out.print("\n");
    DiamondName.draw(n, name);
    System.out.print("\n");

    FizzBuzz.count();
  }
}
