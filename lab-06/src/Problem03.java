import processing.core.*;

public class Problem03 extends PApplet {
    public void star(int rays, float x, float y, float outerRadius, float innerRadius, int color, float angle) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        for (int i = 0; i < rays; i++) {

            float radius = i % 2 == 0 ? outerRadius : innerRadius;
            float endX1 = x + cos(angle) * radius;
            float endY1 = y + sin(angle) * radius;
            line(x, y, endX1, endY1);

            radius = i % 2 != 0 ? outerRadius : innerRadius;
            float endX2 = x + cos(angle + angleDelta) * radius;
            float endY2 = y + sin(angle + angleDelta) * radius;
            line(endX1, endY1, endX2, endY2);
            angle += angleDelta;
        }
    }


    public void settings() {
        size(1000 , 1000);
    }

    public void setup() {
        background(0);
        strokeWeight(2);
        star(8, width * 0.5f, height * 0.5f, 100.0f, 40.0f, 0xFFFF0000, 0.0f);
        star(8, width * 0.25f, height * 0.25f, 70f, 30f, 0xFFFFFF00, 0f);
        star(8, width * 0.75f, height * 0.25f, 70f, 30f, 0xFFFFFF00, 0f);
        star(8, width * 0.25f, height * 0.75f, 70f, 30f, 0xFFFFFF00, 0f);
        star(8, width * 0.75f, height * 0.75f, 70f, 30f, 0xFFFFFF00, 0f);
    }

    public void draw() {


        //rect
        //line
        //square
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}