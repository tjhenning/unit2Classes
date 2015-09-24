
public class DistanceConverter
{
   public static void main(String[] args)
   {
      
      final int FEET_PER_YARD = 3;
      final int INCHES_PER_FEET = 12;
      double yards = 3.5;
      double feet = yards * FEET_PER_YARD;
      double inches = feet * INCHES_PER_FEET;
      
      System.out.println(yards + " yards are " + feet + " feet ");
      System.out.println(yards + " yards are " + inches + " inches ");
   }
}