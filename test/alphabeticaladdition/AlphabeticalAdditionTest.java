/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticaladdition;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trevor
 */
public class AlphabeticalAdditionTest {
    
    public AlphabeticalAdditionTest() {
    }

    /**
     * Test of addLetters method, of class AlphabeticalAddition, with ABC.
     */
    @Test
    public void testAddLettersABC() {
        char[] letters = new char[] {'a', 'b', 'c'};
        char expected = 'f';
        char actual = AlphabeticalAddition.addLetters(letters);
        assertTrue(expected == actual);
    }
    
    /**
     * Test of addLetters method, of class AlphabeticalAddition, with AB.
     */
    @Test
    public void testAddLettersAB() {
        char[] letters = new char[] {'a', 'b'};
        char expected = 'c';
        char actual = AlphabeticalAddition.addLetters(letters);
        assertTrue(expected == actual);
    }
    
    /**
     * Test of addLetters method, of class AlphabeticalAddition, with Z.
     */
    @Test
    public void testAddLettersZ() {
        char[] letters = new char[] {'z'};
        char expected = 'z';
        char actual = AlphabeticalAddition.addLetters(letters);
        assertTrue(expected == actual);
    }
    
    /**
     * Test of addLetters method, of class AlphabeticalAddition, with ZA.
     */
    @Test
    public void testAddLettersZA() {
        char[] letters = new char[] {'z', 'a'};
        char expected = 'a';
        char actual = AlphabeticalAddition.addLetters(letters);
        assertTrue(expected == actual);
    }
    
    /**
     * Test of addLetters method, of class AlphabeticalAddition, with YCB.
     */
    @Test
    public void testAddLettersYCB() {
        char[] letters = new char[] {'y', 'c', 'b'};
        char expected = 'd';
        char actual = AlphabeticalAddition.addLetters(letters);
        assertTrue(expected == actual);
    }
    
    /**
     * Test of addLetters method, of class AlphabeticalAddition, with none.
     */
    @Test
    public void testAddLettersNone() {
        char[] letters = new char[0];
        char expected = 'z';
        char actual = AlphabeticalAddition.addLetters(letters);
        assertTrue(expected == actual);
    }
    
}
