import processing.core.*;

import java.util.*;

public class Problem04 extends PApplet {
    Random random = new Random();
    static final int ROWS = 15;
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
        cellSize = Math.min(width / COLS, height / ROWS) * (1f - CELL_GAP);
        float cy = (height - ROWS * cellSize) / 2f;
        float cx = (width - COLS * cellSize) / 2f;
        appleX = (cx + cellSize / 2);
        appleY = (cy + cellSize / 2);
        appleKX = (random.nextInt(0, 15));
        appleKY = (random.nextInt(0, 15));
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

        float cellSize = Math.min(width / COLS, height / ROWS) * (1.0f - CELL_GAP);

        float cy = (height - ROWS * cellSize) / 2.0f;
        float cx = (width - COLS * cellSize) / 2.0f;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                float x = cx + j * cellSize;
                float y = cy + i * cellSize;
                rect(x, y, cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");

    }

}