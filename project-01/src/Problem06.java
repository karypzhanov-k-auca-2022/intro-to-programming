import processing.core.*;

public class Problem06 extends PApplet {

    public void settings() {
        fullScreen();

    }

    float theta = 0;
    float NUMBER_OF_CIRCLES = 40;


    public void setup() {
        noStroke();

    }

    public void draw() {
        background(0, 0, 0);
        float r = 100;
        float dr = r / NUMBER_OF_CIRCLES;
        float redComp = 5;
        float dRedComp = (255 - redComp) / NUMBER_OF_CIRCLES;

        int rSun = 200;
        int rVenus = 50;
        int rMoon = 20;

        int SunComp = 10;
        int VenusComp = 30;
        int moonComp = 5;

        float drSun = rSun / NUMBER_OF_CIRCLES;
        float drVenus = rVenus / NUMBER_OF_CIRCLES;
        float drMoon = rMoon / NUMBER_OF_CIRCLES;

        float dSunComp = (255 - SunComp) / NUMBER_OF_CIRCLES;
        float dVenusComp = (255 - VenusComp) / NUMBER_OF_CIRCLES;
        float dMoonComp = (255 - moonComp) / NUMBER_OF_CIRCLES;

        //Второе действие
        //Прописываю кнопки  и текст
        // И как Рисовали Орбиты

        //Sun

        fill(0, 0, 255);
        stroke(255);
        strokeWeight(5);
        rect(width - 200, 0, 200, 50);
        fill(255);
        textSize(25);
        text("Sun", width * 0.91f, 30);

        if (mouseX < (width) && mouseX > (width - 200) && mouseY > 0 && mouseY < 50) {
            // Орбита для Солнца
            // Прописываем после текста и Прямоугольников
            pushMatrix();
            translate(width / 2f, height / 2f);
            noFill();
            strokeWeight(8);
            stroke(255, 0, 0);
            ellipse(0, 0, 200, 200);
            popMatrix();
            fill(255, 0, 0);
            textSize(25);
            text("Sun", width * 0.91f, 30);
        }

        //Venus
        noStroke();
        fill(0, 0, 255);
        stroke(255);
        strokeWeight(5);
        rect(width - 200, 50, 200, 50);
        fill(255);
        textSize(25);
        text("Venus", width * 0.91f, 30 + 50);


        if (mouseX < (width) && mouseX > (width - 200) && mouseY > 50 && mouseY < 100) {
            //Orbit for Venus
            // Прописываем после текста и Прямоугольников
            pushMatrix();
            translate(width / 2f, height / 2f);
            noFill();
            strokeWeight(8);
            stroke(255, 0, 0);
            ellipse(0, 0, 400, 400);
            popMatrix();
            fill(255, 0, 0);
            textSize(25);
            text("Venus", width * 0.91f, 30 + 50);

        }
        //Earth
        fill(0, 0, 255);
        stroke(255);
        strokeWeight(5);
        rect(width - 200, 100, 200, 50);
        fill(255);
        textSize(25);
        text("Earth", width * 0.91f, 30 + 100);
        //Earth Rectangle mouse Condition
        //Text in rectangle
        if (mouseX < (width) && mouseX > (width - 200) && mouseY > 100 && mouseY < 150) {
            //Orbit for Earth
            // Прописываем после текста и Прямоугольников
            pushMatrix();
            translate(width / 2f, height / 2f);
            noFill();
            strokeWeight(8);
            stroke(255, 0, 0);
            ellipse(0, 0, 721, 721);
            popMatrix();
            fill(255, 0, 0);
            textSize(25);
            text("Earth", width * 0.91f, 30 + 100);
        }

        //Earth Spinning circle
        fill(0, 0, 255);
        stroke(255);
        strokeWeight(5);
        rect(width - 200, 150, 200, 50);
        fill(255);
        textSize(25);
        text("Moon", width * 0.91f, 30 + 150);
        if (mouseX < (width) && mouseX > (width - 200) && mouseY > 150 && mouseY < 200) {
            //Орбита Муун
            // Прописываем после текста и Прямоугольников

            fill(255, 0, 0);
            textSize(25);
            text("Moon", width * 0.91f, 30 + 150);
        }

//Рисуем Планеты
        //Солнце Обжект
        stroke(0);
        translate(width / 2f, height / 2f);
        // Style Blur Planet
        for (int i = 0; i < rSun; ++i) {
            noStroke();

            fill(SunComp, SunComp, 0);
            ellipse(0, 0, rSun, rSun);
            rSun -= drSun;
            SunComp += dSunComp;

        }

        //Venus Object
        pushMatrix();
        rotate(theta);
        translate(200, 0);
        // Style Blur Planet Venus
        for (int i = 0; i < r; ++i) {
            noStroke();
            fill(redComp, 0, redComp);
            ellipse(0, 0, r, r);
            r -= dr;
            redComp += dRedComp;
        }
        if (mouseX < (width) && mouseX > (width - 200) && mouseY > 50 && mouseY < 100) {
            noFill();
            stroke(255);
            strokeWeight(8);
            ellipse(0, 0, 100 + 10, 100 + 10);
        }
        popMatrix();

        //Earth and Moon Object
        pushMatrix();
        rotate(theta);
        translate(350, 0);
        // Style Blur Planet
        for (int i = 0; i < rVenus; ++i) {
            noStroke();
            fill(0, 0, VenusComp);
            ellipse(0, 0, rVenus, rVenus);
            rVenus -= drVenus;
            VenusComp += dVenusComp;

            //Загарается когда Только для Муун-Кнопка Муун
            if (mouseX < (width) && mouseX > (width - 200) && mouseY > 150 && mouseY < 200) {
                noFill();
                strokeWeight(5);
                stroke(255, 0, 0);
                ellipse(0, 0, 50 + 10, 50 + 10);

            }
            //Загарается для Земли и ее орбиты -Кнопка Земля
            if (mouseX < (width) && mouseX > (width - 200) && mouseY > 100 && mouseY < 150) {
                noFill();
                strokeWeight(5);
                stroke(255);
                ellipse(0, 0, 50 + 10, 50 + 10);
            }
        }

        //  Муун Обжект
        pushMatrix();
        rotate(-theta * 8);
        translate(36, 0);
        // Style Blur Planet
        for (int i = 0; i < rMoon; ++i) {
            noStroke();
            fill(moonComp, moonComp, moonComp);
            ellipse(0, 0, rMoon, rMoon);
            rMoon -= drMoon;
            moonComp += dMoonComp;

            //Загарается для Земли и ее орбиты -Кнопка Земля
            if (mouseX < (width) && mouseX > (width - 200) && mouseY > 150 && mouseY < 200) {
                noFill();
                strokeWeight(2);
                stroke(255);
                ellipse(0, 0, 20 + 5, 20 + 5);
            }
        }
        popMatrix();
        popMatrix();
        theta += 0.02;
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }
}
