package by.epam.ayem.module4;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
//вычисления площади, периметра и точки пересечения медиан.

public class AppRunner {

    public static void main(String[] args) {

        TriangleService triangleService = new TriangleService();

        triangleService.createTriangle(3, 2, 5, 1, 5, 3);
        triangleService.triangleSquare();
        triangleService.trianglePerimeter();
        triangleService.centroid();

        triangleService.createTriangle(6, 5, 6, 2, 8, 14);
        triangleService.triangleSquare();
        triangleService.trianglePerimeter();
        triangleService.centroid();
    }
}
