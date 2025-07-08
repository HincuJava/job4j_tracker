package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return x - z;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;

    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int minusResult = Calculator.minus(3);
        System.out.println(minusResult);
        Calculator calculator = new Calculator();
        int multiplyResult = calculator.multiply(4);
        System.out.println(multiplyResult);
        int divideResult = calculator.divide(10);
        System.out.println(divideResult);
        int sumAllOperationResult = calculator.sumAllOperation(5);
        System.out.println(sumAllOperationResult);
    }

}