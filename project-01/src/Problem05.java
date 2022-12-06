import processing.core.PApplet;

import java.util.Random;

public class Problem05 extends PApplet {
    Random random = new Random();
    static int ROWS = 8;
    static int COLS = 8;
    static int LINE_COLOR = 255;
    float cellSize;
    static final float LINE_WEIGHT = 3f;
    static final float CELL_GAP = 0.2f;
    String CellColor = ""; //Для вывода цвета клетки

    int CellRow;  //  Для вывода Строки
    int CellCol; // Для вывода  Столбца

    public void settings() {
        fullScreen();
    }

    public void setup() {

        float cellSize = (Math.min(width / COLS, height / ROWS) * (1f - CELL_GAP));
        frameRate(10);
    }

    public void draw() {
        background(0);  // Черный фон
        stroke(LINE_COLOR); // Цвет Границ клеток
        strokeWeight(LINE_WEIGHT);  // Жироность Границ клеток

        float cellSize = (Math.min(width / COLS, height / ROWS) * (1f - CELL_GAP)); // Высчитывается Размер Клетки
        float cy = (height - ROWS * cellSize) / 2f; // Координаты первой клетки ,туда ее ставят
        float cx = (width - COLS * cellSize) / 2f;


        for (int i = 0; i < ROWS; i++) {    // Цикл рисует клетки доски
            for (int j = 0; j < COLS; j++) {
                float x = cx + j * cellSize;
                float y = cy + i * cellSize;

                if (((i + j) % 2) == 0) {     // определяем зеленая клетка или белая по столбцам и строкам, i and j
                    fill(255);
                }
                if (((i + j) % 2) != 0) {
                    fill(1, 69, 60);
                }
                rect(x, y, cellSize, cellSize);  // Рисуется клетка либо зеленая либо белая
            }
        }

        fill(0, 40);
        noStroke();

        //Цикл для распознования с Мышкой координат клетки (Строка :Колонка)

        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= COLS; j++) {
                if (mouseX < cx + (cellSize * i) && mouseX > cx + (cellSize * (i - 1)) &&
                        mouseY < cy + (cellSize * j) && mouseY > cy + (cellSize * (j - 1))) {
                    CellRow = i;  //Здесь находим Строку
                    CellCol = j;  // А тут столбец

                    float x = cx + (CellRow - 1) * cellSize;
                    float y = cy + (CellCol - 1) * cellSize;
                    noFill();
                    stroke(255, 0, 0);
                    rect(x, y, cellSize, cellSize);

                    if (((i + j) % 2) == 0) {
                        CellColor = "White";
                    } else if (((i + j) % 2) != 0) {
                        CellColor = "Green";
                    }
                }
            }
        }
        // Просто вывожу текст
        fill(255, 255, 0);
        text("Row: " + CellRow + ";" + " Colum:" + CellCol + ";" + " Cell color: " + CellColor, width * 0.15f, height * 0.07f);
        textSize(45);
    }

    public void keyPressed() {
        if (keyPressed && keyCode == '+' || keyCode == '=') {
            if (ROWS < 12) {
                ROWS += 1;
                COLS += 1;
            }
        }
        if (keyPressed && keyCode == '-' || keyCode == '_') {
            if (ROWS > 4) {
                ROWS -= 1;
                COLS -= 1;
            }
        }
    }
    public static void main (String[]args){
        PApplet.main("Problem05");

    }
}