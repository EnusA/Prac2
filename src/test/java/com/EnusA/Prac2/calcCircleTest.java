package com.EnusA.Prac2;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.junit.Test;
import org.junit.Ignore;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/03/18.
 */
public class calcCircleTest {
    //i. Floating Point
    @Test
    public void testCircCalcArea() throws Exception {

        float area = 3.14f*(5*5);
        //assertEquals("Successfully failed floating point test.",69.5f, area,0.5f);
        assertEquals("Successfully passed floating point test.",78.5f, area,0.5f);
    }
    //ii. Integers
    @Test
    public void testPerimeter() throws Exception {
        int perimeter = 2 + 7 + 2 + 7;
        //assertEquals("This is a failing integer test.", 33, perimeter);
        assertEquals("This is a passing integer test.", 18, perimeter);
    }
    //iii. Object Equality
    @Test
    public void testShapesIdentity() throws Exception{
        Shapes squareType = new Shapes("Square",2,7);
        Shapes squareT = new Shapes("Square",2,7);
        //assertSame("Test for Object Identity(Fail).",squareType, squareT);
        assertSame("Test for Object Identity(Pass).",squareType, squareType);
    }
    //iv. Object Identity
    @Test
    public void testShapesEquality() throws Exception{
        Shapes squareType = new Shapes("Square",2,7);
        Shapes circleType = new Shapes("Circle",5f);
        Shapes squareT = new Shapes("Square",2,7);
        //assertTrue("Test for object Equality (Fail)",EqualsBuilder.reflectionEquals(squareType, circleType));
        assertTrue("Test for object Equality (Pass)",EqualsBuilder.reflectionEquals(squareType, squareT));
    }

    //v. Truth
    @Test
    public void testTruely() throws Exception{
        int a = 3;
        int b = 4;
        int c = a + b;
        boolean yesNo = false;
        if (c == 7)
        {
            yesNo = true;
        }

        assertTrue("Test for true (Pass)", yesNo);
    }

    //vi. False
    @Test
    public void testFalsified() throws Exception{
        int a = 3;
        int b = 4;
        int c = a + b;
        boolean yesNo = true;
        if (c != 8)
        {
            yesNo = false;
        }

        assertFalse("Test for true (Pass)", yesNo);
    }

    //vii. Nullness
    @Test
    public void testNullShape() throws Exception{
        Shapes newShape = new Shapes();
        assertNull("This should be null", newShape.getName());
    }

    //viii. Non Nullness
    @Test
    public void testNotNullShape() throws Exception{
        Shapes newShape = new Shapes("circle",5);
        assertNotNull("This should be null", newShape.getName());
    }

    //ix. Failing Test
    @Test
    public void testFailing() throws Exception {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);

            if (i == 5)
            {
                fail("Fail test passed");
                System.out.println("i");
                for (int b = 5; b < 0; b--)
                {
                    System.out.println(b);

                }
            }
        }
    }

    //x. Exception 11. Timeouts
    @Test(timeout = 10)
    public void testEndlessException() throws Exception{
        for (int i = 1; i > 0; i++)
        {
            System.out.println(i);
        }
        System.out.println("Time out Exception reached");
    }

    //xi. Disabling Test
    @Ignore
    public void testIgnore() throws Exception {
    System.out.println("Hello World!!");
    }

    //xii. Arrays Content
    @Test
    public void testCheckArrays() throws Exception{
        int[] areas1 = new int[]{12, 34, 42, 43, 69};
        int[] areas2 = new int[]{12, 34, 42, 43, 9};
        assertTrue("Array content check",Arrays.equals(areas1, areas2));
    }
}

