package com.udla.ci_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testHelloMessage() {
        String mensaje = "Hola CI/CD";
        assertEquals("Hola CI/CD", mensaje);
    }
}