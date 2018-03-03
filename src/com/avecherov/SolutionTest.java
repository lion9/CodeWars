package com.avecherov;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SolutionTest {
    @Test
    public void sampleTests() {
        System.out.println("True");
        assertTrue("pot".matches(Kata.reg));
        assertTrue("support".matches(Kata.reg));
        assertTrue("Sparta".matches(Kata.reg));
        assertTrue("slap two".matches(Kata.reg));
        assertTrue("respite".matches(Kata.reg));
        System.out.println("False");
        assertFalse("pt".matches(Kata.reg));
        assertFalse("Pot".matches(Kata.reg));
        assertFalse("pilates".matches(Kata.reg));
        assertFalse("pilot".matches(Kata.reg));

    }
}