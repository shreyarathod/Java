import java.util.*;
interface Area{
  double getArea ();

}

interface Perimeter{
  double getPerimeter();
}


class Rectangle implements Area, Perimeter{
  double length = 0;
  double breadth  = 0;

  public double getArea(){
    double area = length * breadth;
      return area;
  }

  public double getPerimeter(){
    double perimeter = 2 * (length + breadth);
    return perimeter;

  }
}

public class Main{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    Rectangle r1 = new Rectangle ();
      System.out.print ("Enter the length of Rectangle:");
      r1.length = sc.nextDouble ();
      System.out.print ("Enter the breadth of Rectangle:");
      r1.breadth = sc.nextDouble ();
      System.out.println ("Area :" + r1.getArea ());
      System.out.println ("Perimeter:" + r1.getPerimeter ());


  }
}

