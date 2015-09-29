import java.util.Scanner;

public class Annuity
{
   public static void main(String[] args)
   {
      System.out.println("PMT?");
      Scanner s = new Scanner(System.in);
      double pmt=s.nextDouble();//10000;
      System.out.println("i?");
      double i=s.nextDouble();//.08;
      System.out.println("n?");
      double n=s.nextDouble();//20;
      double PVann=pmt*(((Math.pow((1+i),n-1)-1)/i)/(Math.pow((1+i),n-1))+1);
      PVann*=100;
      PVann=Math.round(PVann);
      PVann/=100;
      System.out.println(PVann);
   }
}
