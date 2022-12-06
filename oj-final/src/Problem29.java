import java.util.Scanner;

public class Problem29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPictures;
        int minimumPerimeter;
        int width;
        int height;

        while (true) {
            numberOfPictures = scanner.nextInt();

            if (numberOfPictures == 0) {
                break;
            }

            width = numberOfPictures;
            height = 1;
            minimumPerimeter = width * 2 + height * 2;

            for (int i = 1; i <= Math.sqrt(numberOfPictures); i++) {
                if (numberOfPictures % i != 0) {
                    continue;
                }
                if (i * 2 + numberOfPictures / i * 2 < minimumPerimeter) {
                    height = i;
                    width = numberOfPictures / i;
                }
                minimumPerimeter = width * 2 + height * 2;
            }

            System.out.printf("Minimum perimeter is %d with dimensions %d x %d%n", minimumPerimeter, height, width);
        }
    }
}
