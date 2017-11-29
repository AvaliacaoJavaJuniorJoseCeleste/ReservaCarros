/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservacarros;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josué
 */
public class ReservaCarrosTest {
    
    public ReservaCarrosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ReservaCarros.
     */
    @Test
    public void testMain() {
        assertEquals("Normal:3:16Mar2009(seg),17Mar2009(ter),18Mar2009(qua)", "Gol:SouthCar");
    }
    
}
