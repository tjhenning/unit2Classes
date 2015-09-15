
/**
 * A simple car. It has fuel efficiency and a gas tank. 
 * It may be 'driven' which depletes the gas in the tank.
 * Unfortunatly, it doesn't actually go anywhere, so your gas is wasted.
 * 
 * @author Tyler Henning 
 * @version 9/10/15
 */
public class Car
{
    /** The fuel efficiency of the gar in mpg */
    private double fuelEfficiency;
    /** The amount of fuel in the tank measured in gallons.*/
    private double gasInTank;
    /**
     * Constructor for objects of class Car that specifies fuel efficiencey.
     */
    public Car(double fuelEfficiency2)
    {
        fuelEfficiency = fuelEfficiency2;
        gasInTank = 0;
    }

    /**
     * This simulates driving the car for a specified distance and reduces gas in tank.
     *
     * @pre        The specified distance will not consume more than the avaliable gas.
     *            
     * @param    distance    the distance the car will drive in miles.
     */
    public void drive(double distance)
    {
        gasInTank-=distance/fuelEfficiency;
    }

    /**
     *  Returns the amount of gas in the tank in gallons
     *
     * @return  Returns amount of gas in the tank in gallons
     */
    public double getGasInTank()
    {
        return gasInTank;
    }

    /**
     * Add more gas to the tank
     * 
     * @pre     Must be +
     * 
     * @param   fill  Amount of gas to add to the tank
     */
    public void addGas(double fill)
    {
        gasInTank+=fill;        
    }
}
