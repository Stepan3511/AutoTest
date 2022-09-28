package com.geekbrains.Lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

public class FunctionsTest {
    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Метод выполнется 1 раз перед всеми теставми данного класса");

    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Метод выполнится перед каждым тестом");
    }

    @Test

    @DisplayName("Тест проверяет метод isPalindrome с палиндромом")
    void givenPalindromeWhenCallsPalindromeMethodThenTrue() {
        boolean result = Functions.isPalindrome("1234321");
        Assertions.assertTrue(result);
    }



    @Test
    void checkWordWithOneCharacterIsPalindrome() {
        boolean result = Functions.isPalindrome("1");
        Assertions.assertTrue(result);
    }

    @AfterEach

    void afterEach() {
        System.out.println("Метод выполнится после каждого теста");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Метод выполнится 1 раз после запуска всех тестов класса");
    }
}
