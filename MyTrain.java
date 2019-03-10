import objectdraw.*;
import java.awt.*;
/**
 * Write a description of class MyTrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyTrain extends WindowController 
{    
    static final int WHEEL_DIAMETER = 50; 
    static final int BODY_HEIGHT = 90; 
    static final int ENGINE_HEIGHT = 60; 
    boolean bottomDisplayed; 
    int trackHeight;
    int trainTop; 
    FilledOval bottomSmoke;
    FilledOval topSmoke; 
    
    public void begin() {
        trackHeight = getHeight() - 10;
        
        // background
        new FilledRect(0, 0, getWidth(), getHeight(), canvas).setColor(Color.GREEN);
        // tracks
        new Line(0, trackHeight, getWidth(), trackHeight, canvas); 
        // train wheels
        new FilledOval(95, trackHeight - WHEEL_DIAMETER, WHEEL_DIAMETER, WHEEL_DIAMETER, canvas); 
        new FilledOval(255, trackHeight - WHEEL_DIAMETER, WHEEL_DIAMETER, WHEEL_DIAMETER, canvas);
        // train body
        new FilledRect(50, trackHeight - WHEEL_DIAMETER - BODY_HEIGHT, 300, BODY_HEIGHT, canvas).setColor(Color.RED);
        // steam engine 
        new FilledRect(255, trackHeight - WHEEL_DIAMETER - BODY_HEIGHT - ENGINE_HEIGHT, 50, ENGINE_HEIGHT, canvas);
        trainTop = trackHeight - WHEEL_DIAMETER - BODY_HEIGHT - ENGINE_HEIGHT - 10;
        new FilledRect(245, trainTop, 70, 10, canvas);
        // smoke
        bottomSmoke = new FilledOval(260, trainTop - 10 - 20, 40, 20, canvas);
        topSmoke = new FilledOval(245, trainTop - 10 - 20 - 10 - 30, 50, 30, canvas);
        bottomSmoke.setColor(Color.LIGHT_GRAY);
        topSmoke.setColor(Color.LIGHT_GRAY);
        
        // hide smoke
        bottomSmoke.hide();
        topSmoke.hide();
    }
    
    public void onMouseClick(Location point) {
        // smoke
        if (bottomDisplayed) {
            topSmoke.show();
        }
        bottomSmoke.show(); 
        bottomDisplayed = true;
    }
}
