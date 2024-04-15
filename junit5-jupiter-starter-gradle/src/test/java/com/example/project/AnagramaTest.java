package com.example.project;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramaTest {

    @Test
    public void testAreAnagrams() {

        assertTrue(Anagrama.areAnagrams("Hola", "aloh"));
        assertFalse(Anagrama.areAnagrams("Hola", "adios"));
        assertFalse(Anagrama.areAnagrams("hola", "hoola"));
        assertFalse(Anagrama.areAnagrams(null, "hola"));
        assertFalse(Anagrama.areAnagrams(null, null));
        
    }
}
