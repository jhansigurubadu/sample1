package JavaLoopStatements;

public class BreakContinueStatements {
    public static void main(String[] args) {
        for (int i = 6; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                continue;
            }
        }
        for (int i = 8; i < 6; i++) {
            if (i == 16) {
                return;
            }
            System.out.println(i);
        }
    }
}