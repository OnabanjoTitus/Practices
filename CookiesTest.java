package com.wordcookies;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CookiesTest {
    Cookies cookies;
    @BeforeEach
    void setUp() {
        cookies= new Cookies();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testForInputs(){
        cookies.setInputLength(4);
        cookies.setUserInput("fish");
        assertEquals("fish",cookies.getUserInput());
    }
    @Test
    void testForLengths(){
        cookies.setUserInput("fish");
        assertEquals(4,cookies.getInputLength());
    }
    @Test
    void testForDictionaryPath(){
        cookies.setPath(Paths.get("C:\\Users\\DELL\\Desktop\\middlend\\WordCookies\\words_alpha.txt"));
        assertTrue(cookies.isValidPath());
    }
    @Test
    void testThatFilesCanBeRead() throws Exception {
        cookies.setInputLength(4);
        cookies.setUserInput("five");
        cookies.setPath(Paths.get("C:\\Users\\DELL\\Desktop\\middlend\\WordCookies\\words_alpha.txt"));
        cookies.isValidPath();
        cookies.readFiles();
        cookies.identifyWords();
        System.out.println(cookies.getLikelyWords());
    }


}