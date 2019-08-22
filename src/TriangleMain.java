public class TriangleMain {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1,2,5,1,5,3);
        triangle1.triangleSquare();
        triangle1.trianglePerimeter();
        triangle1.centroid();
        Triangle triangle2 = new Triangle(3,5,6,2,8,14);
        triangle2.triangleSquare();
        triangle2.trianglePerimeter();
        triangle2.centroid();
    }
}
