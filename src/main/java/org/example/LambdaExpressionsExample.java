package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        // Task 1 and Task 2: Simple Lambda Expressions and Custom Functional Interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8.0
        System.out.println("Subtraction: " + subtraction.operate(5, 3)); // Output: 2.0
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15.0
        System.out.println("Division: " + division.operate(6, 3)); // Output: 2.0

        // Task 3: Using built-in functional interfaces

        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // Output: true

        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println("Length of 'hello': " + stringLength.apply("hello")); // Output: 5

        Consumer<String> printMessage = (message) -> System.out.println("Message: " + message);
        printMessage.accept("Hello, world!");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }
}
