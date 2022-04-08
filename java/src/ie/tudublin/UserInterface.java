package ie.tudublin;
import processing.core.*;

public class UserInterface extends PApplet
{
    public void settings()
    {
        size(1500, 800);
    }

    float t, r;
    Sphere sphere = new Sphere(80, 20 * radians(t += (TWO_PI / 360)), this);

    public void setup()
    {
        t = 0;
        r = 130;
    }

    public void draw()
    {
        background(0);
        drawRing();
        drawSphere();
    }

    void drawRing()
    {
        float w = width / 2;
        float h = height / 2;

        stroke(0, 255, 255);
        noFill();
        strokeWeight(2);
        ellipse(w, h, 300, 300);
    }

    void drawSphere()
    {
        float rotateX = 20 * radians(t += (TWO_PI / 360));

        translate(width / 2, height / 2);
        rotateY(rotateX);
        noFill();
        stroke(0, 255, 255);
        strokeWeight(0.5f);
        sphere(r);
    }
}