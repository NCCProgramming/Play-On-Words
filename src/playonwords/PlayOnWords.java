/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playonwords;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Jacob
 */
public class PlayOnWords {

    /**
     * @param args the command line arguments
     */
    
    private static Game game;
    
    public static void main(String[] args) 
    {
        initDisplay();
        initGL();
        
        initGame();
        
        gameLoop();
        cleanUp();
    }
    
    private static void initGame()
    {
        game = new Game();
    }
    
    private static void getInput()
    {
        game.getInput(); 
    }
    
    private static void update()
    {
        game.update();
        
    }
    
    private static void render()
    {
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIdentity();

        game.render();

        Display.update();
        Display.sync(60);
    }
    
    private static void gameLoop()
    {
        while(!Display.isCloseRequested())
        {
            getInput();
            update();
            render();
        }
    }
    
    private static void initGL()
    {
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,Display.getWidth(),0,Display.getHeight(),-1,1);
        glMatrixMode(GL_MODELVIEW);
        
        glClearColor(.25f,0.5f,1,1);
        glDisable(GL_DEPTH_TEST);
        
        
        
        
    }
    
    private static void cleanUp()
    {
        Display.destroy();
    }
    
    private static void initDisplay()
    {
        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
            Display.setVSyncEnabled(true);
        } catch (LWJGLException ex) {
            Logger.getLogger(PlayOnWords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
