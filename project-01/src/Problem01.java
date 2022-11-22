import processing.core.*;

public class Problem01 extends PApplet {

    public void settings() {
        fullScreen();
        size(500, 250);
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        circle(width / 2.0f, height / 2.0f,1000.0f);
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}