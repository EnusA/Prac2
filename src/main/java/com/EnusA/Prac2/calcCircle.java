package com.EnusA.Prac2;

import org.apache.commons.lang.builder.EqualsBuilder;

import java.util.Arrays;

/**
 * Created by enusa on 2017/03/18.
 */
public class calcCircle {
    public float testCalcArea(float rad) {
        float answer;
        answer = 3.14f* (rad*rad);
        return answer;
    }

    public int testPerimeter(int length, int width){
        int perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

    public void shapesIdentity() {
        Shapes squareType = new Shapes("Square",2,7);
        Shapes squareT = new Shapes("Square",2,7);
    }

    public void shapesEquality() throws Exception{
        Shapes squareType = new Shapes("Square",2,7);
        Shapes circleType = new Shapes("Circle",5f);
        Shapes squareT = new Shapes("Square",2,7);
    }


    public void truely() throws Exception{
        int a = 3;
        int b = 4;
        int c = a + b;
        boolean yesNo = false;
        if (c == 7)
        {
            yesNo = true;
        }
    }


    public void falsified() throws Exception{
        int a = 3;
        int b = 4;
        int c = a + b;
        boolean yesNo = true;
        if (c != 8)
        {
            yesNo = false;
        }
    }


    public void nullShape() throws Exception{
        Shapes newShape = new Shapes();
    }


    public void notNullShape() throws Exception{
        Shapes newShape = new Shapes("circle",5);
    }


    public void failing() throws Exception {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);

            if (i == 5)
            {
                System.out.println("i");
                for (int b = 5; b < 0; b--)
                {
                    System.out.println(b);

                }
            }
        }
    }

    public void endlessException() throws Exception{
        for (int i = 1; i > 0; i++)
        {
            System.out.println(i);
        }
        System.out.println("Time out Exception reached");
    }

    public void ignore() throws Exception {
        System.out.println("Hello World!!");
    }

    public void checkArrays() throws Exception{
        int[] areas1 = new int[]{12, 34, 42, 43, 69};
        int[] areas2 = new int[]{12, 34, 42, 43, 9};
    }
}