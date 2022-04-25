package ie.tudublin;
import processing.core.PApplet;


public class PurpleRain extends PApplet{
    
    Drop[] drops = new Drop[100];
    
    public void settings()
    {
        size(1024, 1000);
        for(int i=0; i<drops.length; i++)
        {
            drops[i] = new Drop();
        }
    }

    public void draw()
    {
        background(230, 230, 250);
        for(int i=0; i<drops.length; i++)
        {
            drops[i].fall();
            drops[i].show();

        }
    }

    
}
