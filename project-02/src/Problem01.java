import processing.core.PApplet;

public class Problem01 extends PApplet {
    static final int NUM_OF_SNOWFLAKES = 300;
    float[] x = new float[NUM_OF_SNOWFLAKES];
    float[] y = new float[NUM_OF_SNOWFLAKES];
    float[] r = new float[NUM_OF_SNOWFLAKES];
    float[] color = new float[NUM_OF_SNOWFLAKES];
    float[] angle = new float[NUM_OF_SNOWFLAKES];
    float[] dAngle = new float[NUM_OF_SNOWFLAKES];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        strokeWeight(3);
        for (int i = 0; i < NUM_OF_SNOWFLAKES; i++) {
            x[i] = random(width);
            y[i] = random(height);
            r[i] = random(height / 60f, height / 30f);
            angle[i] = random(2 * PI);
            dAngle[i] = random(-0.02f, 0.02f);
            color[i] = random(20, 255);
        }
    }


    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < NUM_OF_SNOWFLAKES; i++) {
            drawStar(x[i], y[i], r[i], angle[i]);
            y[i] += r[i] / 4f;
            angle[i] += dAngle[i];

            if (y[i] > height) {
                x[i] = random(width);
                y[i] = -r[i];
            }
        }
    }

    void drawStar(float xc, float yc, float r, float angle) {
        pushMatrix();
        translate(xc, yc);
        rotate(angle);
        stroke((float) 255.0);

        float x1 = 0;
        float y1 = -r;
        float y2 = 0;
        float x3 = 0;
        float x4 = -r;
        float y4 = 0;
        float x5 = r / 2f;
        float y5 = -r / 2f;
        float x6 = r / 2f;
        float y6 = r / 2f;
        float x7 = -r / 2f;
        float y7 = r / 2f;
        float x8 = -r / 2f;
        float y8 = -r / 2f;

        line(x1, y1, x3, r);
        line(r, y2, x4, y4);
        line(x5, y5, x7, y7);
        line(x6, y6, x8, y8);

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}