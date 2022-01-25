package com.assignment.cardNumber;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardNumberTest {
    CardNumber number = new CardNumber();
    @Test
    public void validityTest1() {
        assertTrue("only 16 digits", number.validity("1234567899876543"));
    }
    @Test
    public void validityTest2() {
        assertFalse("contains more than or less than 16 digits",number.validity("1234567890009876543"));
        assertFalse(number.validity("12543"));
    }
    @Test
    public void negativeNumberTest() {
        assertFalse("Negative numbers",number.validity("-1234567899876543"));
        assertFalse("Symbols",number.validity("123456*899876543"));
        assertFalse("Symbols",number.validity("123456/899876543"));
        assertNotEquals(true,number.validity("123456(8S9876543"));
    }
    @Test
    public void sizeOfCardNumberTest1() {
        assertEquals(16,number.sizeOfCardNumber("1234567899876543"));
    }
    @Test
    public void sizeOfCardNumberTest2() {
        assertNotEquals(" more than or less than 16 digits",number.sizeOfCardNumber("1234567890009876543"),16);
        assertNotEquals(number.sizeOfCardNumber("12543"),16);
    }
    @Test
    public void maskCardNumberTest1() {
        assertEquals("XXXX XXXX XXXX 6533",number.maskCardNumber("1234567899876533"));
    }
    @Test
    public void maskCardNumberTest2() {
        assertNotEquals(number.maskCardNumber("1234567899876543"),"1234 5678 9987 6543");
    }
    @Test
    public void notNullTest1() {
        assertNotNull(number.maskCardNumber("1234567899876543"));
    }
}