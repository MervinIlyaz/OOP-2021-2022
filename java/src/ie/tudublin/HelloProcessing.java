package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		stroke(46, 176, 146);
		background(48, 42, 42);

		fill(52, 113, 235);
		circle(250,250,450);
		
		fill(46, 176, 146);
		triangle(10,450,490,450,250,5);

		fill(73, 77, 66);
		ellipse(250,250,250,100);

		fill(0);
		circle(250,250,75);
	}
}
