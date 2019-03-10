import objectdraw.*;

/**
 * Write a description of class MyFirstClass here.
 * 
 * @author Lydia Cheah 
 * @version (a version number or a date)
 */

public class MyFirstClass extends WindowController 
{
    public void begin() {
    }
    
    public void onMousePress(Location point) {
        new FilledRect(10, 50, 100, 200, canvas);
    }
    
    public void onMouseRelease(Location point) {
        new FilledRect(50, 30, 5, 15, canvas);
    }
    
    public void onMouseClick(Location point) {
        new FilledRect(point, 20, 40, canvas);
    }
    
    public void onMouseDrag(Location point) {
        new FilledRect(point, 2, 2, canvas);
    }
}