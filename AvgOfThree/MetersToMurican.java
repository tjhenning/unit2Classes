
import java.util.Scanner;

public class MetersToMurican
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Give a number of meters: ");
      double num=s.nextDouble();
      double miles= num*.000621371;
      double feet=num*3.28084;
      
      System.out.println("Miles: "+miles);
      System.out.println("Feet: "+feet);
      System.out.println("Inches: "+feet*12);
   }
}
