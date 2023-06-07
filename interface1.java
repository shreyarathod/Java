import java.util.*;
interface Volume{
  double getVolume ();

}

interface SurfaceArea{
  double getSurfaceArea ();
}


class Cylinder implements Volume, SurfaceArea{
  double radius = 0;
  double height = 0;

  public double getSurfaceArea (){
    double surfacearea =
      (6.283 * radius * height) + (6.283 * radius * radius);
      return surfacearea;
  }

  public double getVolume () {
    double volume = 3.14 * radius * radius * height;
    return volume;

  }
}

public class Main{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    Cylinder c1 = new Cylinder ();
      System.out.print ("Enter the radius of Cylinder:");
      c1.radius = sc.nextDouble ();
      System.out.print ("Enter the height of Cylinder:");
      c1.height = sc.nextDouble ();
      System.out.println ("Surface Area :" + c1.getSurfaceArea ());
      System.out.println ("Volume:" + c1.getVolume ());


  }
}
