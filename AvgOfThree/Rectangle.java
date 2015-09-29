import java.util.Scanner;

public class Rectangle
{
   public static void main(String[] args)
   {      
      Scanner s = new Scanner(System.in);
      System.out.print("What is the height of the rectangle?: ");
      double height=s.nextDouble();
      System.out.print("What is the width of the rectangle?: ");
      double width=s.nextDouble();
      System.out.println("The Area is: "+(height*width));      
      System.out.println("The Perimiter is: "+(height+width)*2);
      double ram=(width*width)+(height*height);  
      System.out.println("The Diagonal's Length is: "+Math.sqrt(ram));
   }
}
