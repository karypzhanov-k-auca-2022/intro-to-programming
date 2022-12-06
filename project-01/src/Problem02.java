import processing.core.*;

public class Problem02 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0, 0, 0);
    }

    float sizeLarge = 1;
    float dx1 = 60, dx2 = 60, dx3 = 60;

    public void draw() {
        fill(0, 0, 0, 1000);
        rect(0, 0, width, height);

        fill(255, 0, 0);
        textSize(dx1);
        text("Java Slogan:", width / 2f, height / 4f);

        fill(0, 255, 0);
        textSize(dx2);
        text("Write once,", width / 2f, height / 2f);

        fill(0, 0, 255);
        textSize(dx3);
        text("run anywhere!", width / 2f, 3 * height / 4f);

        for (int a = 0; a < 100000; a++) {
            if (dx3 == 60) {
                for (int i = 0; i < 242; i++) {
                    if (dx1 < 60 || dx1 > 180) {
                        sizeLarge *= -1;
                    }
                    dx1 += sizeLarge;
                }
            }
            if (dx1 == 60) {
                for (int e = 0; e < 242; e++) {
                    if (dx2 < 60 || dx2 > 180) {
                        sizeLarge *= -1;
                    }
                    dx2 += sizeLarge;
                }
            }
            if (dx2 == 60) {
                for (int t = 0; t < 242; t++) {
                    if (dx3 < 60 || dx3 > 180) {
                        sizeLarge *= -1;
                    }
                    dx3 += sizeLarge;
                }
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }
}