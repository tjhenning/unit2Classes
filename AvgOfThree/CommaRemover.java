
import java.util.Scanner;

public class CommaRemover
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Give a number between 1,000 and 999,999 with a comma: ");
      String num=s.next();
      //num=num.replace(",",""); //this method works better but not what we're meant to do
      int length=num.length();
      length-=4;
      String num1=num.substring(0,length);
      num=num.substring(length+1,length+4);
      
      System.out.print(num1+num);
   }
}
