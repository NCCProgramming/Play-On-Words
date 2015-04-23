/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playonwords;

/**
 *
 * @author Jacob
 */
public abstract class GameObject 
{
    protected float x, y;
    protected float sx, sy;//size
    
    abstract void update();
    public void render()
    {
        Draw.rect(x,y,sx,sy);
    }
    
    public float getX()
    {
        return x;
    }
            
    public float getY()
    {
        return y;
    }
    
    public float getSX()
    {
        return sx;
    }
    
    public float getSY()
    {
        return sy;
    }
    
    
}
