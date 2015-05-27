/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package playonwords;

import static org.lwjgl.opengl.GL11.*;
/**
 *
 * @author Jacob
 */
public class Draw {
    public static void rect(float x, float y, float width, float height)
    {
        rect(x,y,width,height,0,0,0);
    }
    
    public static void rect(float x, float y, 
                            float width, float height, 
                            float hx, float hy,
                            float rot)
    {
        float w2 = width/2;
        float h2 = height/2;
        
        
        glPushMatrix();
        {
            glTranslatef(x,y,0);
            glRotatef(rot,0,0,1);
            glTranslatef(w2-hx,h2-hy,0);
                        
            glBegin(GL_QUADS);
            {
                glVertex2f(-w2,h2);
                glVertex2f(w2,h2);
                glVertex2f(w2,-h2);
                glVertex2f(-w2,-h2);
            }
            glEnd();
        }
        glPopMatrix();
    }
    public static void card(float x, float y, float sx, float sy, String L, float rot)
    {
        glPushMatrix();
        {
            float SW = 5;//stripe width
            float hx = (sx)/2, hy = (sy)/2;//handle x y
            
            glTranslatef(x,y,0);
            glRotatef(rot,0,0,1);
            
            glColor3f(0f,0f,0f);
            rect(-1,-1,sx+2,sy+2,hx,hy,0);
            glColor3f(1f,1f,1f);
            rect(0,0,sx,sy,hx,hy,0);

            glColor3f(0f,0f,1f);
            rect(SW, SW, SW, sy/2, hx, hy, 0);
            rect(sx-SW, sy-SW, -SW, -sy/2, hx, hy, 0);
            rect(SW, SW, sx/2, SW, hx, hy, 0);
            rect(sx-SW, sy-SW, -sx/2, -SW, hx, hy, 0);
        }
        glPopMatrix();
        
        
    }
    
    public static void cardBack(float x, float y, float sx, float sy, String L)
    {
    
    }
}
