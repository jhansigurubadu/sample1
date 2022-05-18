package overloading;

public class Main {
        public static void main(String[] args) {
            Calculator c = new Calculator();
            System.out.println(c.sum(10, 20));
            System.out.println(c.sum(10, 69, 58));
            System.out.println(c.sum(65, 85));
        }
}
