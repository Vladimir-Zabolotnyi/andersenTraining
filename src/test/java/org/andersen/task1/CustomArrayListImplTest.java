package org.andersen.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class CustomArrayListImplTest {
    List<String> customArrayList;

    @BeforeEach
    void setUp() {
        this.customArrayList = new CustomArrayListImpl<>();
    }

    @Test
    void size() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertEquals(5, customArrayList.size());
    }

    @Test
    void isEmpty() {
        assertTrue(customArrayList.isEmpty());
    }

    @Test
    void indexOf() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertEquals(2, customArrayList.indexOf("Third"));
    }

    @Test
    void lastIndexOf() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Second");
        assertEquals(3, customArrayList.lastIndexOf("Second"));
    }

    @Test
    void contains() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertTrue(customArrayList.contains("First"));
        assertFalse(customArrayList.contains("Sixth"));
    }

    @Test
    void add() {
        assertTrue(customArrayList.add("First"));
        assertTrue(customArrayList.add("Second"));
        assertEquals(2, customArrayList.size());
        assertFalse(customArrayList.isEmpty());
        assertTrue(customArrayList.contains("First"));
        assertTrue(customArrayList.contains("Second"));

    }

    @Test
    void addToSpecificPosition() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add(1, "addNumberToSpecPosition");
        assertEquals(4, customArrayList.size());
        assertEquals("addNumberToSpecPosition", customArrayList.get(1));
        assertTrue(customArrayList.contains("Second"));
    }

    @Test
    void removeElement() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertTrue(customArrayList.remove("Second"));
        assertEquals(4, customArrayList.size());
        assertFalse(customArrayList.contains("Second"));
    }

    @Test
    void get() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertEquals("Fifth", customArrayList.get(4));
    }

    @Test
    void set() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertEquals("setNumber", customArrayList.set(2, "setNumber"));
        assertEquals("setNumber", customArrayList.get(2));
        assertEquals(2, customArrayList.indexOf("setNumber"));
        assertEquals(5, customArrayList.size());
        assertFalse(customArrayList.contains("Third"));
    }

    @Test
    void removeElementByIndex() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        assertEquals("Fourth", customArrayList.remove(3));
        assertEquals(4, customArrayList.size());
        assertFalse(customArrayList.contains("Fourth"));
    }

    @Test
    void clear() {
        customArrayList.add("First");
        customArrayList.add("Second");
        customArrayList.add("Third");
        customArrayList.add("Fourth");
        customArrayList.add("Fifth");
        customArrayList.clear();
        assertTrue(customArrayList.isEmpty());
    }

}