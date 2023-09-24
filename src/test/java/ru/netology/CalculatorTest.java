package ru.netology;

import org.junit.jupiter.api.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void beforeAll () {
        calculator = new Calculator();
    }

    @DisplayName("Проверка результата деления")
    @Test
    void isDevideNumber() {

        final var num = 1;
        Assertions.assertEquals(num, calculator.devide.apply(2, 2));

    }

    @DisplayName("Проверка результата деления на 0")
    @Test
    void isDevideZero() {

        final var num = 0;
        Assertions.assertEquals(num, calculator.devide.apply(2, 0));

    }

    @DisplayName("Проверка результата деления на 0")
    @Test
    void isMultiplyZero() {

        final var num = 4;
        Assertions.assertEquals(num, calculator.multiply.apply(2, 2));

    }

}