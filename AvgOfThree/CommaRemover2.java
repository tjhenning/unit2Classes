
import java.util.Scanner;

public class CommaRemover2
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Give a number between 1000 and 999999 without a comma: ");
      String num=s.next();      
      int length=num.length();
      length-=4;
      String num1=num.substring(0,length+1);
      num=num.substring(length+1,length+4);
      
      System.out.print(num1+","+num);
   }
}
