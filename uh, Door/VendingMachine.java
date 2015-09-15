

/**
 * A vending machine that dispenses a can for a coin
 * 
 * @author Tyler
 * @version 9/15/99
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens=0;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        cans = 10;
    }

      /**
     * Constructor for objects of class VendingMachine where you 
     * specify how many cans it starts with
     */
    public VendingMachine(int numOfCans)
    {
        cans = numOfCans;
    }
    
    /**
     * Fills up the machine with cans
     *
     * @param    newCans the amount of cans you want to add
     */
    public void fillUp(int newCans)
    {
        cans+=newCans;
    }

    /**
     * Inserts a token into the machine
     *
     * @pre     There must be at least one can or it will eat your token
     * 
     * @post    adds one to tokens and removes one can
     * 
     * @return  The can that you bought with your tokens.
     */
    public String insertToken()
    {
        tokens++;
        cans-=1;
        return "Here's a can!";
    }

    /**
     * Fills up the machine with cans
     *
     * @param    newCans the amount of cans you want to add
     */
    public void insertCans(int newCans)
    {
        cans+=newCans;
    }
    
    /**
     * returns amount of tokens in machine
     *
     * @return  # of tokens in machine
     */
    public int getTokenCount()
    {
        return tokens;
    }
    /**
     * returns amount of cans in machine
     *
     * @return  # of cans in machine
     */
    public int getCanCount()
    {
        return cans;
    }
}
