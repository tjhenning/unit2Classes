public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      final double JAR_CAPACITY = 0.75; // gallons
      int completelyFilledJars = (int)(milk / JAR_CAPACITY);
      
      System.out.println(completelyFilledJars);
   }
}
