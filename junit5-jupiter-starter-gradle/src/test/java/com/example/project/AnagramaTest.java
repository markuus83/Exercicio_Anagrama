package com.example.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramaTest {

    @Test
    public void testAreAnagrams() {

        assertTrue(anagrama.areAnagrams("Hola", "aloh"));
        assertFalse(anagrama.areAnagrams("Hola", "adios"));
        assertFalse(anagrama.areAnagrams(null, "hola"));
        assertFalse(anagrama.areAnagrams(null, null));
        assertFalse(anagrama.areAnagrams("hola", "hoola"));
    }
}
