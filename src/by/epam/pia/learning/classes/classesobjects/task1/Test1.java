package by.epam.pia.learning.classes.classesobjects.task1;

public class Test1 {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return Math.max(a, b);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
