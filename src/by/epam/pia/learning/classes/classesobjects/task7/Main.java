package by.epam.pia.learning.classes.classesobjects.task7;

// Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.

public class Main {

    public static void main(String[] args) {
        //Вырожденный треугольник
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(2, 2);

        Triangle triangle1 = new Triangle(a, b, c);
        print(triangle1);

        a = new Point(-10, 2);
        b = new Point(5, -4);
        c = new Point(2, 2);

        triangle1 = new Triangle(a, b, c);
        print(triangle1);
    }

    protected static void print(Triangle t) {
        System.out.println();
        System.out.println("Периметр=" + t.getPerimeter());
        System.out.println("Площадь=" + t.getSquare());
        Point centroid = t.getCentroid();
        System.out.println("Координаты точки пересечения медиан x=" + centroid.x +
                " y=" + centroid.y);
    }
}
