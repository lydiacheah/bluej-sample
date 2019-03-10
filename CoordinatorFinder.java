import objectdraw.*;

/**
 * Write a description of class CoordinatorFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoordinatorFinder extends WindowController
{
    Text instructions; 
    
    public void begin() {
        instructions = new Text("Click any point to get the X and Y coordinates in the console", 
                                0, 0, canvas);
        instructions.moveTo(getWidth() / 2 - instructions.getWidth() / 2, getHeight() / 4);
    }
    
    public void onMouseClick(Location point) {
        instructions.hide();
        System.out.println("(" + (int) point.getX() + "," + (int) point.getY() + ")");
    }
}
