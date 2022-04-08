public class Main {

    public static void main(String[] args) throws RuntimeException {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1 ,2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

//        Реализация исключения при делении на ноль
//        try {
//            c = calc.devide.apply(a, b);
//            calc.println.accept(c);
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на 0 не возможно");
//        }
        calc.println.accept(c);
        int x = calc.abs.apply(-10);
        int y = calc.pow.apply(c);

        calc.println.accept(x);
        calc.println.accept(y);
    }
}
