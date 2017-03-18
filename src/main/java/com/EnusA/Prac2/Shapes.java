package com.EnusA.Prac2;

/**
 * Created by enusa on 2017/03/18.
 */
public class Shapes {
    private float radius = 0;
    private int length = 0;
    private int width = 0;
    private String shapeName = null;
    public Shapes ()
    {}
    public Shapes (String nm, float rad)
    {
        shapeName = nm;
        radius = rad;
    }
    public Shapes (String nm, int len, int wid)
    {
        shapeName = nm;
        length = len;
        width = wid;
    }
    public String getName()
    {
        return shapeName;
    }

}
