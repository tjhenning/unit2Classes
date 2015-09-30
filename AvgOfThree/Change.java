
import java.util.Scanner;

public class Change
{
   public static void main(String[] args)
   {      
      Scanner s = new Scanner(System.in);
      System.out.print("How much did it cost?: ");
      double price=s.nextDouble();
      System.out.print("How much did you pay with?: ");
      double pay=s.nextDouble();
      double total=pay-price;
      int dollars=0;
      int quarters=0;
      int dimes=0;
      int nickles=0;
      int pennies=0;
      while (total>=1){
          total-=1;
          dollars++;
   }while (total>=.25){
          total-=.25;
          quarters++;
   }while (total>=.1){
          total-=.1;
          dimes++;
   }while (total>=.05){
          total-=.05;
          nickles++;
   }while (total>=.01){
          total-=.01;
          pennies++;
   }
   System.out.print("Change:\nDollars: "+dollars+"\nQuarters: "+quarters+"\nDimes: "+dimes+"\nNickles: "+nickles+"\nPennies: "+pennies);
}
}