import processing.core.*;
import java.util.Random;

public class Problem04 extends PApplet {
    Random random = new Random();

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        for (int i = 0; i < 1; i++) {
            int red = random.nextInt(255);
            int green = random.nextInt(255);
            int blue = random.nextInt(255);

            int radius = random.nextInt(0, 50);
            int x = random.nextInt(0, width);
            int y = random.nextInt(0, height);

            fill(red, green, blue);
            circle(x, y, radius);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem09");
    }
}