//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
//вычисления площади, периметра и точки пересечения медиан.

import static java.lang.Math.sqrt;

public class Triangle {

    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;

    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public void triangleSquare() {
        double square = Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));
        System.out.println("Square = " + square);
    }

    public void trianglePerimeter() {
        double a = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double p = a + b + c;

        System.out.printf("Perimeter = %.2f\n", p);
    }

    public void centroid() {
        double c1 = (double) (x1 + x2 + x3) / 3;
        double c2 = (double) (y1 + y2 + y3) / 3;
        System.out.printf("Centroid is (%.2f;%.2f)\n", c1, c2);
    }
}






















