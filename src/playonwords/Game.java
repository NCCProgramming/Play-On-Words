package playonwords;

import java.util.ArrayList;
import org.lwjgl.input.Mouse;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class Game {

    int x = 0;
    
    private ArrayList<GameObject> objects;
    
    public Game()
    {
        objects = new ArrayList<GameObject>();
    }
    
    public void getInput()
    {
        
    }
    
    public void update()
    {
        for(GameObject go : objects)
            go.update();
    }
    
    public void render()
    {
        for(GameObject go : objects)
            go.render();
        Draw.card(Mouse.getX(),Mouse.getY(),140,180,"F", x++);
        
    }
            
}
