package by.epam.ayem.module4;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
//вычисления площади, периметра и точки пересечения медиан.

import static java.lang.Math.sqrt;

public class TriangleService {

    Triangle triangle;

    public void createTriangle(int x1, int x2, int x3, int y1, int y2, int y3){
        this.triangle = new Triangle(x1, x2, x3, y1, y2, y3);
    }

    public void triangleSquare() {
        double square = Math.abs(0.5 * ((triangle.getX1() - triangle.getX3())
                * (triangle.getY2() - triangle.getY3()) - (triangle.getX2() - triangle.getX3())
                * (triangle.getY1() - triangle.getY3())));
        System.out.println("Square = " + square);
    }

    public void trianglePerimeter() {
        double a = sqrt((triangle.getX1() - triangle.getX2()) * ((triangle.getX1() - triangle.getX2())
                + (triangle.getY1() - triangle.getY2()) * (triangle.getY1() - triangle.getY2())));
        double b = sqrt((triangle.getX1() - triangle.getX3()) * (triangle.getX1() - triangle.getX3())
                + (triangle.getY1() - triangle.getY3()) * (triangle.getY1() - triangle.getY3()));
        double c = sqrt((triangle.getX2() - triangle.getX3()) * (triangle.getX2() - triangle.getX3())
                + (triangle.getY2() - triangle.getY3()) * (triangle.getY2() - triangle.getY3()));
        double p = a + b + c;

        System.out.printf("Perimeter = %.2f\n", p);
    }

    public void centroid() {
        double c1 = (double) (triangle.getX1() + triangle.getX2() + triangle.getX3()) / 3;
        double c2 = (double) (triangle.getY1() + triangle.getY2() + triangle.getY3()) / 3;
        System.out.printf("Centroid is (%.2f;%.2f)\n", c1, c2);
    }
}
