import processing.core.*;

public class Problem06 extends PApplet {
    final int EARTH_X = 300;
    final int EARTH_Y = 0;
    float r = 0;



    public void settings() {
        fullScreen();
    }

    public void setup() {


    }

    public void draw() {
        background(0, 0, 0);
        pushMatrix();
        translate(width / 2f, height / 2f);
        rotate(radians(r));
        //sun
        fill(255,255,0);
        ellipse(0,0,150,150);

        //earth

        fill(0,255,100);
        ellipse(EARTH_X, EARTH_Y, 50, 50);
        pushMatrix();

        //moon
        translate(EARTH_X,EARTH_Y);
        rotate(radians(-r * 3));
        fill(255);
        ellipse(50, EARTH_Y, 20, 20);
        popMatrix();

        //venus
        fill(0, 0, 200);
        ellipse(-150,0,30,30);
        popMatrix();
        r += 1;


        fill(0,0,180);
        stroke(255);
        rect(width/1.2f,height/6f,180,40);
        textSize(70);
        fill (255);
        text("Earth", width/ 1.3f, height/ 6f);

        fill(0,0,180);
        stroke(255);
        rect(width/1.2f, height/8f,180,40 );

        fill(0,0,180);
        stroke(255);
        rect(width/1.2f, height/12f,180,40 );

        fill(0,0,180);
        stroke(255);
        rect(width/1.2f, height/24f,180,40 );




    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}