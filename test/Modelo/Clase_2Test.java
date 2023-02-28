/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jeferson.agudelo
 */
public class Clase_2Test {
    
    public Clase_2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CalcularPrecioBase method, of class Clase_2.
     */
    @Test
    public void testCalcularPrecioBase() {
        System.out.println("CalcularPrecioBase");
        Clase_1 bas = null;
        Clase_2 instance = new Clase_2();
        float expResult = 0.0F;
        float result = instance.CalcularPrecioBase(bas);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcularPrecioCoche method, of class Clase_2.
     */
    @Test
    public void testCalcularPrecioCoche() {
        System.out.println("CalcularPrecioCoche");
        Clase_1 per = null;
        Clase_2 instance = new Clase_2();
        float expResult = 0.0F;
        float result = instance.CalcularPrecioCoche(per);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcularPrecioMicro method, of class Clase_2.
     */
    @Test
    public void testCalcularPrecioMicro() {
        System.out.println("CalcularPrecioMicro");
        Clase_1 per = null;
        Clase_2 instance = new Clase_2();
        float expResult = 0.0F;
        float result = instance.CalcularPrecioMicro(per);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcularPrecioFurgo method, of class Clase_2.
     */
    @Test
    public void testCalcularPrecioFurgo() {
        System.out.println("CalcularPrecioFurgo");
        Clase_1 per = null;
        Clase_2 instance = new Clase_2();
        float expResult = 0.0F;
        float result = instance.CalcularPrecioFurgo(per);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcularPrecioCamion method, of class Clase_2.
     */
    @Test
    public void testCalcularPrecioCamion() {
        System.out.println("CalcularPrecioCamion");
        Clase_1 per = null;
        Clase_2 instance = new Clase_2();
        float expResult = 0.0F;
        float result = instance.CalcularPrecioCamion(per);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Clase_2.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Clase_2 instance = new Clase_2();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
