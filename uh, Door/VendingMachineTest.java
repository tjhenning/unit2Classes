

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
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
    public void testItAll()
    {
        VendingMachine machine=new VendingMachine();
        assertEquals(machine.getCanCount(),10);
        machine.fillUp(10);
        assertEquals(machine.getCanCount(),20);
        machine.insertToken();
        assertEquals(machine.getCanCount(),19);
        machine.insertToken();
        machine.insertToken();
        machine.insertToken();
        machine.insertToken();
        machine.insertToken();
        assertEquals(machine.getCanCount(),14);
        assertEquals(machine.getTokenCount(),6);
    }
}
