    import processing.core.*;

    public class Problem01 extends PApplet {

        public void settings() {
            fullScreen();
        }

        public void setup() {
            background(0, 0, 0);
        }

        int pointMoveX = (int) Math.floor(Math.random() * 1) + 9;
        int pointMoveY = (int) Math.floor(Math.random() * 1) + 9;
        int dx = 0;
        int dy = 0;
        int radius = 100;

        public void draw() {

            fill(0, 0, 0, 20);
            rect(0, 0, width, height);
            fill(0, 0, 255);
            noStroke();
            circle(width * 0.25f + dx, height * 0.25f + dy, radius);

            fill(120, 0, 235);
            circle(width * 0.25f + dx, height * 0.75f + dy, radius);

            fill(255, 40, 120);
            circle(width / 2.0f + dx, height / 2.0f + dy, radius);

            fill(255, 0, 255);
            circle(width * 0.75f + dx, height * 0.25f + dy, radius);

            fill(25, 67, 0);
            circle(width * 0.75f + dx, height * 0.75f + dy, radius);

            if (dx <= -width / 4 + radius / 2 || dx >= width / 4 - radius / 2) {
                pointMoveX *= -1;
            }
            if (dy <= -height / 4 + radius / 2 || dy >= height / 4 - radius / 2) {
                pointMoveY *= -1;
            }
            dx += pointMoveX;
            dy += pointMoveY;
        }

        public static void main(String[] args) {
            PApplet.main("Problem01");
        }
    }

