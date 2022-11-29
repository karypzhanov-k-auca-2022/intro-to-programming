import processing.core.PApplet;


public class Problem03 extends PApplet {
    String circle = "Circle";
    String rectangle = "Rectangle";
    String ring = "Ring";

    public void settings() {
        fullScreen();


    }

    public void setup() {

        background(1, 2, 3);

        rectMode(CENTER);

    }

    public void draw() {
        background(0, 0, 0);

    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}
