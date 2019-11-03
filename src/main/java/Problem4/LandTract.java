/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 *
 * @author vueld
 */
public class LandTract
{
    private float length;
    private float width;
    
    public void setLength(float length)
    {
        this.length = length;
    }
    
    public void setWidth(float width)
    {
        this.width = width;
    }
    
    public float getArea(float length, float width)
    {
        this.length = length;
        this.width = width;
        
        float area = this.length * this.width;
        
        return area;
    }
    
    public boolean equals(LandTract area2)
    {
        if ((this.length * this.width) == area2.getArea(length, width))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "Area: " + (length * width);
    }
}
