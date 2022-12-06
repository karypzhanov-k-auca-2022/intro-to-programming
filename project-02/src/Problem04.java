import processing.core.*;

import java.util.Random;

public class Problem04 extends PApplet {
    float[] xdir;
    float[] ydir;
    float[] speedx;
    float[] speedy;
    float[] x;
    float[] y;
    int cnt1;
    int cnt2;
    int cnt;

    public void settings() {
        fullScreen();
        size(1920, 1080);

    }

    public void setup() {
        cnt = 100;
        x = new float[cnt];
        y = new float[cnt];
        cnt1 = 0;
        cnt2 = 0;
        speedx = new float[cnt];
        speedy = new float[cnt];
        Random rand = new Random();
        for (int i = 0; i < cnt; i++) {
            x[i] = width / 2;
            y[i] = height / 2;
            speedx[i] = rand.nextFloat(0.001f, 5f);
            speedy[i] = (float) Math.sqrt(25 - speedx[i] * speedx[i]);
        }
    }

    public void draw() {

        background(0, 0, 0);
        stroke(0, 0, 255);
        strokeWeight(2);
        line(width / 8, 200, width / 8 + 400, 200);
        line(width / 8 + 400, 200, width / 8 + 400, 300);
        line(width / 8 + 400, 300, width / 8 + 800, 300);
        line(width / 8 + 800, 300, width / 8 + 800, 200);
        line(width / 8 + 800, 200, width / 8 + 1200, 200);
        line(width / 8 + 1200, 200, width / 8 + 1200, 600);
        line(width / 8 + 1200, 600, width / 8 + 800, 600);
        line(width / 8 + 800, 600, width / 8 + 800, 500);
        line(width / 8 + 800, 500, width / 8 + 400, 500);
        line(width / 8 + 400, 500, width / 8 + 400, 600);
        line(width / 8 + 400, 600, width / 8, 600);
        line(width / 8, 600, width / 8, 200);
        stroke(0, 0, 0);
        strokeWeight(0);

        for (int i = 0; i < cnt; i++) {
            fill(0, 0, 0);
            rect(width / 8 + 200, 100, 100, 99);
            rect(width / 8 + 900, 100, 100, 99);
            fill(148, 0, 211);
            textSize(35);

            text(cnt1, width / 8 + 200, 180);
            text(cnt2, width / 8 + 900, 180);

            if (x[i] + speedx[i] < width / 8 + 10 || x[i] + speedx[i] > width / 8 + 1200 - 10) {
                speedx[i] *= -1;
            }
            if (y[i] + speedy[i] < 200 + 10 || y[i] + speedy[i] > 600 - 10) {
                speedy[i] *= -1;
            }
            if (x[i] >= width / 8 - 10 && x[i] <= width / 8 + 400 + 10) {
                cnt1++;
                if (x[i] + speedx[i] >= width / 8 + 400 - 10) {
                    if (y[i] <= 300 + 10 || y[i] >= 500 - 10) {

                        speedx[i] *= -1;
                    }

                }
            }
            if (x[i] >= width / 8 + 400 - 10 && x[i] <= width / 8 + 800 + 10) {
                if (y[i] + speedy[i] >= 500 - 10 || y[i] + speedy[i] <= 300 + 10) {
                    speedy[i] *= -1;
                }
            }
            if (x[i] >= width / 8 + 800 - 10 && x[i] <= width / 8 + 1200 + 10) {
                cnt2++;
                if (x[i] + speedx[i] <= width / 8 + 800 + 10) {
                    if (y[i] <= 300 + 10 || y[i] >= 500 - 10) {
                        speedx[i] *= -1;
                    }

                }
            }
            x[i] += speedx[i];
            y[i] += speedy[i];

            fill(255, 255, 0);
            circle(x[i], y[i], 20);

        }
        cnt1 = 0;
        cnt2 = 0;
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");

    }

}