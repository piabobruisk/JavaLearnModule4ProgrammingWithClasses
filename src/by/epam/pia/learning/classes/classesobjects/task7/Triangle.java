package by.epam.pia.learning.classes.classesobjects.task7;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        this(new Point(0, 0), new Point(2, 4), new Point(4, 0));
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return getSideLength(a,b)+
                getSideLength(a,c)+
                getSideLength(b,c);
    }

    private double getSideLength(Point t1, Point t2) {
        return Math.sqrt(Math.pow(t2.x - t1.x, 2) + Math.pow(t2.y - t1.y, 2));
    }

    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getSideLength(a,b)) *
                (p - getSideLength(a,c)) * (p - getSideLength(b,c)));
    }

    public Point getCentroid() {
        //G=1/3*(a+b+c)=1/3*(Xa+Xb+Xc),1/3*(Ya+Yb+Yc)
        return new Point ( (a.x +b.x+c.x)/3.0, (a.y +b.y+c.y)/3.0);
    }
}
