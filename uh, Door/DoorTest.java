

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class DoorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DoorTest
     */
    public DoorTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
 
    @Test
    public void testIt()
    {
        Door door= new Door("front","open");
        assertEquals(door.getState(),"open");
        door.close();
        assertEquals(door.getState(),"closed");
        door.open();
        assertEquals(door.getState(),"open");
        door.setState("closed");
        assertEquals(door.getState(),"closed");
        assertEquals(door.getName(),"front");
        door.setName("back");
        assertEquals(door.getName(),"back");
    }
}
