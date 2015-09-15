

/**
 * Write a description of class Door here.
 * 
 * @author Tyler Henning
 * @version 9/15/15
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String state="";
    private String name="";

    /**
     * Constructor for objects of class Door
     */
    public Door(String name2, String state2)
    {        
        name = name2;
        state = state2;
    }

    /**
     * Closes the door
     *
     * @post    changes the doors state to closed
     */
    public void close()
    {
        // put your code here
        state="closed";
    }
   /**
     * Opens the door
     *
     * @post    changes the doors state to open
     */
    public void open()
    {
        // put your code here
        state="open";
    }
    
    /**
     * Returns name of door
     *
     * @return  the name of the door
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    /**
     * Returns state of door
     *
     * @return  the state of the door
     */
    public String getState()
    {
        // put your code here
        return state;
    }
    /**
     * Changes name of door
     *
     * @param   New name of the door
     */
    public void setName(String newName)
    {
        // put your code here
        name=newName;
    }
  
    /**
     * Changes state of door
     *
     * @param   New name of the door
     */
    public void setState(String newState)
    {
        // put your code here
        state=newState;
    }
}
