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

        noStroke();
        fill(0, 191, 255);
        rect(width / 2.f, height / 2.0f, 400, 280);

        noStroke();
        fill(250, 0, 0);
        circle(width / 4.0f, height / 2.0f, 336);

        stroke(0, 0, 250);
        strokeWeight(50);
        fill(1, 2, 3);
        circle(width / 2.0f + width / 4.0f, height / 2.0f, 320);

        if (Math.sqrt(Math.pow(mouseX - (width / 4.0f), 2) + Math.pow(mouseY - (height / 2.0f), 2)) <= 336 / 2.0f) {
            textSize(100);
            fill(255, 255, 255);
            text(circle, width / 2.0f - 110, height / 2.0f + height / 4.0f + 100);

            stroke(255, 234, 0);
            strokeWeight(10);
            fill(250, 0, 0);
            circle(width / 4.0f, height / 2.0f, 328);
        }
        if (mouseX >= (width / 2 - (200)) && mouseX <= (width / 2 + (200)) && mouseY >= (height / 2 - (140)) && mouseY <= (height / 2 + (140))) {
            textSize(100);
            fill(255, 255, 255);
            text(rectangle, width / 2.0f - 200, height / 2.0f + height / 4.0f + 100);

            stroke(255, 234, 0);
            strokeWeight(10);
            fill(0, 191, 255);
            rect(width / 2.0f, height / 2.0f, 400, 300);
        }
        if (Math.sqrt(Math.pow(mouseX - (width / 2.0f + width / 4.0f), 2) + Math.pow(mouseY - (height / 2.0f), 2)) - 20 <= 336 / 2.0f) {
            textSize(100);
            fill(255, 255, 255);
            text(ring, width / 2.0f - 110, height / 2.0f + height / 4.0f + 100);

            stroke(255, 234, 0);
            strokeWeight(10);
            fill(0, 0, 255);
            circle(width / 2.0f + width / 4.0f, height / 2.0f, 390);

            stroke(255, 234, 0);
            strokeWeight(10);
            fill(1, 2, 3);
            circle(width / 2.0f + width / 4.0f, height / 2.0f, 270);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}
