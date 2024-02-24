package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistryTest {
    
    @Test
    public void testMenorDeEdad() {
        try {
            Person person = new Person("Juan", 123456, 17, Gender.MALE, true);
            assertTrue(person.isMinor());
        } catch (IllegalArgumentException e) {
            fail("No se esperaba una excepción IllegalArgumentException");
        }
    }

    @Test
    public void testMayorDeEdad() {
        try {
            Person person = new Person("Maria", 789012, 18, Gender.FEMALE, true);
            assertFalse(person.isMinor());
        } catch (IllegalArgumentException e) {
            fail("No se esperaba una excepción IllegalArgumentException");
        }
    }

    @Test
    public void testEdadNegativa() {
        try {
            new Person("Pedro", 654321, -5, Gender.MALE, true);
            fail("Se esperaba una excepción IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
}

