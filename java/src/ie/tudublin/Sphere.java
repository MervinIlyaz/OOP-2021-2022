package ie.tudublin;
import processing.core.*;
import processing.data.*;

public class Sphere
{
    float sphereSize;
    float rotate;
    PApplet p;
  
    Sphere(float s, float r, PApplet p)
    {
        sphereSize = s;
        rotate = r;
        this.p = p;
    }
  
    void update()
    {
        sphereSize = 80;
        rotate= 20 * p.radians((p.TWO_PI / 360));
    
        p.rotateY(rotate);
        p.sphere(sphereSize);
    }
}