package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		println(mode);
	}

	float offset = 0;

	public void draw() {


		switch (mode) {
			case 0:

				background(0);
				int bars = (int) (mouseX / 20.0f);
				float w = width / (float) bars;
				for (int i = 0; i < bars; i++) {
					noStroke();
					fill(map(i, 0, bars, -0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}

				break;
			case 1:
				background(0);
				int squares = (int) (mouseX / 20.0f);
				float h = width / (float) squares;
				for (int i = 0; i < squares; i++) {
					noStroke();
					fill(map(i, 0, squares, -0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					rect((width - h) - x, x, h, h);

				}

				break;
			// map(a,b,c,d,e);
			// a = inputValue
			// b - c - start and and of the end range
			// e, e 0 - start and and of the end range

			// map(-2, 10, 90, 200, 233);

			case 2:
				background(0);
				int circles = (int) (mouseX / 20.0f);
				float d = width / (float) circles;
				for (int j = 0; j < circles; j++)
				{

				}
				for (int i = 0; i < circles; i++) {
					noStroke();
					fill(map(i, 0, circles, -0, 255), 255, 255);
					circle(map(i, 0, circles - 1, d / 2, width - (d / 2.0f)), height /2, d);

				}
				break;

			case 3:
			background(0);
                int circles2 = (int) (mouseX / 20.0f);
                offset += (mouseY / 100.0f);
                float diamater = width / (float) circles2;
                for (int j = 0; j < circles2; j++) {
                    for (int i = 0; i < circles2; i++) {
                        noStroke();
                        float c = map((i+j+offset), 0, circles2 * 2, 0, 255) % 256;
                        fill(c, 255, 255);
                        float x = map(i, 0, circles2 - 1, diamater / 2.0f, width - (diamater / 2.0f));
                        float y = map(j, 0, circles2 - 1, diamater / 2.0f, width - (diamater / 2.0f));
                        circle(x, y, diamater);
                    }
                }
		}
	}
}
