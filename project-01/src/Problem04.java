import processing.core.*;

import java.util.*;

public class Problem04 extends PApplet {
    Random random = new Random();
    static final int ROWS = 12;
    static final int COLS = 15;
    static final float LINE_WEIGHT = 3.0f;
    static final float CELL_GAP = 0.2f;

    double circleX;
    double circleY;
    float circleR;
    float appleX;
    int score;
    float appleY;
    int appleKX;
    int appleKY;
    float foodX;
    float foodY;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        float cellSize;
        cellSize = Math.min(width / COLS, height / ROWS) * (1.0f - CELL_GAP);
        float cy = (height - ROWS * cellSize) / 2.0f;
        float cx = (width - COLS * cellSize) / 2.0f;
        appleX = (cx + cellSize / 2.0f);
        appleY = (cy + cellSize / 2.0f);
        appleKX = (random.nextInt(0, 15));
        appleKY = (random.nextInt(0, 12));
        circleX = cx + cellSize / 2.0f;
        circleY = cy + cellSize / 2.0f;
        circleR = height / 35.0f;
        frameRate(144);
        score = 0;

    }

    public void draw() {

        stroke(0, 0, 255);
        strokeWeight(LINE_WEIGHT);
        noFill();

        float cellSizee = Math.min(width / COLS, height / ROWS) * (1.0f - CELL_GAP);

        float cy = (height - ROWS * cellSizee) / 2.0f;
        float cx = (width - COLS * cellSizee) / 2.0f;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                float x = cx + j * cellSizee;
                float y = cy + i * cellSizee;
                rect(x, y, cellSizee, cellSizee);
            }
        }

        fill(0, 40);
        noStroke();
        rect(0, 0, width, height);

        fill(222, 43, 0);
        circle((float) circleX, (float) circleY, cellSizee - 5);
        foodX = appleX + (appleKX * cellSizee);
        foodY = appleY + (appleKY * cellSizee);

        fill(255, 255, 0);
        frameRate(20);
        circle(foodX, foodY, 60);

        fill(255, 0, 0);
        text("Game: Collect Yellow Circles using Arrow Buttons", width * 0.15f, height * 0.07f);
        textSize(70);
        fill(255, 255, 0);
        text("Score: " + score, width * 0.45f, height * 0.95f);


        if (circleX == foodX && circleY == foodY) {
            appleKX = (random.nextInt(0, 15));
            appleKY = (random.nextInt(0, 12));
            foodX = appleX + (appleKX * cellSizee);
            foodY = appleY + (appleKY * cellSizee);
            score += 1;
        }

        if (key == CODED) {
            if (keyCode == UP) {
                circleY = circleY - cellSizee;
                if (circleY < cy) {
                    circleY = circleY + cellSizee;
                }
            }
            if (keyCode == DOWN) {
                circleY = circleY + cellSizee;
                if (circleY > (cy + (cellSizee * 12))) {
                    circleY = circleY - cellSizee;
                }
            }
            if (keyCode == LEFT) {
                circleX = circleX - cellSizee;
                if (circleX < cx) {
                    circleX = circleX + cellSizee;
                }
            }
            if (keyCode == RIGHT) {
                circleX = circleX + cellSizee;
                if (circleX > (cx + (cellSizee * 15))) {
                    circleX = circleX - cellSizee;
                }
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");

    }
}