package com.geekbrains.Lesson4;

import Lesson4.TriangleArea;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void successCalculationTest() throws Exception {
        Assertions.assertEquals(TriangleArea.calculateArea(4, 13, 15), 24);
    }


    @AfterEach
    void afterEach() {

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Тест успешен");
    }
}
