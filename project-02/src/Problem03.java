import processing.core.*;

public class Problem03 extends PApplet {
    int NUMBER_OF_STARS = 100;
    float[] x = new float[NUMBER_OF_STARS];
    float[] y = new float[NUMBER_OF_STARS];
    float[] radius = new float[NUMBER_OF_STARS];

    float[] r = new float[NUMBER_OF_STARS];
    float[] g = new float[NUMBER_OF_STARS];
    float[] b = new float[NUMBER_OF_STARS];
    float zoom = 1.015f;
    float maxR;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        maxR = 20;
        for (int i = 0; i < NUMBER_OF_STARS; i++) {
            resetXandY(i);
            int dt = (int) (Math.random() * 3);
            switch (dt) {
                case 0 -> r[i] = 255;
                case 1 -> g[i] = 255;
                case 2 -> b[i] = 255;
            }
        }
    }


    public void draw() {
        fill(0, 0, 0, 40);
        rect(0, 0, width, height);
        translate(width / 2f, height / 2f);
        for (int i = 0; i < NUMBER_OF_STARS; i++) {

            noStroke();
            fill(r[i], b[i], g[i]);

            circle(x[i], y[i], radius[i]);
            x[i] *= zoom;
            y[i] *= zoom;
            radius[i] *= zoom;
            if (radius[i] > maxR) {
                radius[i] = maxR;
            }

            if (x[i] > width / 2f) {
                resetXandY(i);
            }
        }
    }

    public void resetXandY(int i) {

        float posX = random(-width / 2f, width / 2f);
        float posY = random(-height / 2f, height / 2f);

        x[i] = posX;
        y[i] = posY;

        radius[i] = 2f;
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}