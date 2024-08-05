package org.example;

public class LambdaExpressionsExample {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8.0
        System.out.println("Subtraction: " + subtraction.operate(5, 3)); // Output: 2.0
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15.0
        System.out.println("Division: " + division.operate(6, 3)); // Output: 2.0
    }
}
