package lang.print.gaps.finalModuleTask;

public class DivisionByZero {
    public static void main(String[] args) {
        double number = 10;
        number = Double.POSITIVE_INFINITY;
        System.out.println(number/0);
    }
}
