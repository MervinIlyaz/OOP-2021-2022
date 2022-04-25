package ie.tudublin;
import processing.core.PApplet;


public class Drop extends PApplet{
    
    float x = random(width);
    float y = random(-200, -100);
    private float yspeed = random(4, 10);
    
    public void fall() {
        
        y = y + yspeed;
    } 

    public void show() {
        stroke(138, 43, 226);
        line(x, y, x, y+10);
    }

    
}
