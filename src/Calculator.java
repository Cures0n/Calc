import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
//    BinaryOperator<Integer> devide = (x, y) -> x / y;

//    Ошибка в данном случаем возникает из-за не возможности деления на ноль
//    1-e Решение реализовано путем выброса исключения с описанной ошибкой
//    и реализовано в классе main
//    2-e решение можно сделать через тернарный оператор с выбросом ноля,
//    но математически это не совсем корректно
    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
