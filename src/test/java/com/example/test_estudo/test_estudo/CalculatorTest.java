package com.example.test_estudo.test_estudo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTwoValues(){
        int valueA = 1;
        int valueB = 2;

        Calculator calculator = new Calculator();
        int sum = calculator.add(valueA, valueB);

        assertEquals(3, sum);
    }

    @Test
    public void addThreeValues() {
        int valueA = 3;
        int valueB = 3;
        int valueC = 3;

        Calculator calculator = new Calculator();
        int sum = calculator.add(valueA, valueB, valueC);

        assertEquals(9, sum);
    }

    @Test
    public void addTenValues(){
        int valueA = 5;
        int valueB = 5;
        int valueC = 5;
        int valueD = 5;
        int valueE = 5;
        int valueF = 5;
        int valueG = 5;
        int valueH = 5;
        int valueI = 5;
        int valueJ = 5;

        Calculator calculator = new Calculator();
        int sum = calculator.add(valueA, valueB, valueC, valueD, valueE, valueF, valueG, valueH, valueI, valueJ);

        assertEquals(50, sum);
    }

    @Test
    public void subtractTwoValues(){
        int valueA = 49;
        int valueB = 34;

        Calculator calculator = new Calculator();
        int result = calculator.subtract(valueA, valueB);

        assertEquals(15, result);
    }

    @Test
    public void subtractThreeValues(){
        int valueA = 49;
        int valueB = 34;
        int valueC = 12;

        Calculator calculator = new Calculator();
        int result = calculator.subtract(valueA, valueB, valueC);

        assertEquals(3, result);
    }

    @Test
    public void subtractTenValues(){
        int valueA = 5;
        int valueB = 5;
        int valueC = 5;
        int valueD = 5;
        int valueE = 5;
        int valueF = 5;
        int valueG = 5;
        int valueH = 5;
        int valueI = 5;
        int valueJ = 5;

        Calculator calculator = new Calculator();
        int result = calculator.subtract(valueA, valueB, valueC, valueD, valueE, valueF, valueG, valueH, valueI, valueJ);

        assertEquals(-40, result);
    }

    @Test
    public void multiplyTwoValues(){
        int valueA = 2;
        int valueB = 2;

        Calculator calculator = new Calculator();
        int result = calculator.multiply(valueA, valueB);

        assertEquals(4, result);
    }

    @Test
    public void multiplyThreeValues() {
        int valueA = 3;
        int valueB = 3;
        int valueC = 3;

        Calculator calculator = new Calculator();
        int result = calculator.multiply(valueA, valueB, valueC);

        assertEquals(27, result);
    }

    @Test
    public void multiplyTenValues(){
        int valueA = 5;
        int valueB = 5;
        int valueC = 5;
        int valueD = 5;
        int valueE = 5;
        int valueF = 5;
        int valueG = 5;
        int valueH = 5;
        int valueI = 5;
        int valueJ = 5;

        Calculator calculator = new Calculator();
        int result = calculator.multiply(valueA, valueB, valueC, valueD, valueE, valueF, valueG, valueH, valueI, valueJ);

        assertEquals(9765625, result);
    }

    @Test
    public void divideTwoValues(){
        int valueA = 10;
        int valueB = 2;

        Calculator calculator = new Calculator();
        int result = calculator.divide(valueA, valueB);

        assertEquals(5, result);
    }

    @Test
    public void divideThreeValues() {
        int valueA = 30;
        int valueB = 3;
        int valueC = 2;

        Calculator calculator = new Calculator();
        int result = calculator.divide(valueA, valueB, valueC);

        assertEquals(5, result);
    }
}
