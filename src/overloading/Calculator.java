package overloading;

public class Calculator {
    int sum(int a, int b) {
        return (a + b);
    }

    int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public double sum(double a, double b) {
        return (a + b);
    }
}

