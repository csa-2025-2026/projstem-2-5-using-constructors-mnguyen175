import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Circle c1 = new Circle(10.1); // makes a circle radius 10.1 
    Circle c2 = new Circle(14.0); 
    Circle c3 = new Circle(20.5);

    System.out.println(c1.toString());

    String output = c2.toString();
    System.out.println(output);

    System.out.printf("%s%n", c3.toString());

    // Problem 2 
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number for length and width:"); 
    double lengthWidth = sc.nextDouble();
    System.out.println("Type a length:");
    double length = sc.nextDouble();
    System.out.println("Type a width:");
    double width = sc.nextDouble(); 

    Rectangle r1 = new Rectangle(lengthWidth); 
    Rectangle r2 = new Rectangle(length, width);

    System.out.println(r1.toString() + "\n" + r2.toString());

    // Problem 3 
    System.out.println("Type a side length:"); 
    double sideLength = sc.nextDouble();

    RegularPolygon equilateral = new RegularPolygon(sideLength);
    RegularPolygon sideTriangle = new RegularPolygon(4, sideLength);

    System.out.println(equilateral.toString() + sideTriangle.toString());

  }
}
