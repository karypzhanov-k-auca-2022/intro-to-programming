import processing.core.*;

public class Problem05 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background(0, 0, 0);
        noStroke();
        int radius = 1500;
        int r = 0;

        for (int i = 0; i < 15; i++) {

            fill(r, 0, 0);
            circle(width / 2f, height / 2f, radius);
            radius -= 100;
            r += 15;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem011");
    }

}