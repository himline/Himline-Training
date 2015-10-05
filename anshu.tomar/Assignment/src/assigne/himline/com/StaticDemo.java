package assigne.himline.com;

public class StaticDemo
{
  static int price = 100;
  public static void main(String args[])
  {
    System.out.println(price);                          // without object

    StaticDemo sd1 = new StaticDemo();
    System.out.println(sd1.price);                    // with object

    System.out.println(StaticDemo.price);        // with class name
   }
}
