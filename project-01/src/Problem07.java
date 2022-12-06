import processing.core.PApplet;

public class Problem07 extends PApplet {
    void drawClock() {

        hour();

        float r = PI;


        for (int i = 0; i < 60; i++) {
            pushMatrix();
            translate(width / 2f, height / 2f);
            rotate(r);
            if (i % 5 == 0) {
                stroke(255, 1, 1);
                strokeWeight(5);
                line(0, -250, 0, -300);
            } else {
                stroke(255, 1, 1);
                strokeWeight(5);
                line(0, -250, 0, -280);
            }
            r += PI / 30f;
            popMatrix();
        }


    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(1, 2, 3);


    }

    public void draw() {
        background(1, 2, 3);

        drawClock();


    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }
}