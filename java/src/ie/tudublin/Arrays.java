package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet{
    

    float[] rainfall = {45,37,55,27,38,50,79,48,104,51,100,58};

    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    float[] a1 = new float[100];
    float[] a2;   
    public void settings(){
        size(500,500);
    }
    public void setup(){
        for (int i= 0; i < rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]);
        }
        for (float r:rainfall)
        {
            print(r);
        }

        int j = 0;
        for (float r:rainfall)
        {
            println(r + "\t" + months[j]);
            j++;
        }

        for (int i = rainfall.length - 1; i >=0; i-- )
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < rainfall.length; i++)
        {
            if (rainfall[i] < rainfall[minIndex])
            {
                minIndex = i;
            }
            else if (rainfall[i] > rainfall[maxIndex])
            {
                maxIndex = i;
            }
        }

        println("Max rainfall: " + rainfall[maxIndex] + " in month " +months[maxIndex]);
        println("Min rainfall: " + rainfall[minIndex] + " in month " +months[minIndex]);

    }
    public void draw(){
        background(0);
        colorMode(HSB);
        float w = width / (float)rainfall.length;
        noStroke();
        for (int i = 0; i < rainfall.length; i++)
        {
            float x = map(i, 0, rainfall.length, 0, width);
            int c = (int)map(i, 0, rainfall.length, 0, 255);
            fill(c, 255, 255);
            float h = map(rainfall[i], 0, rainfall[maxIndex], 0, -height);
            rect(x, height, w, -rainfall[i]);
            textAlign(CENTER, CENTER);
            text(months, x + (w/2), height - 50);
        }
    }
    
}