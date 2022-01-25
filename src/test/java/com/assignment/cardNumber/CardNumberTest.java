package com.assignment.cardNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardNumberTest {
    CardNumber number = new CardNumber();
    @Test
    public void validityTest1() {
        assertTrue("contains only 16 digits", number.validity(1234567899876543L));
    }
    @Test
    public void validityTest2() {
        assertFalse("contains more than or less than 16 digits",number.validity(1234567890009876543L));
        assertFalse(number.validity(12543L));
    }
    @Test
    public void negativeNumberTest() {
        assertFalse("Negative numbers",number.validity(-1234567899876543L));
    }
    @Test
    public void sizeOfCardNumberTest1() {
        assertEquals("contains only 16 digits ",16,number.sizeOfCardNumber(1234567899876543L));
    }
    @Test
    public void sizeOfCardNumberTest2() {
        assertNotEquals("contains more than or less than 16 digits",number.sizeOfCardNumber(1234567890009876543L),16);
        assertNotEquals(number.sizeOfCardNumber(12543L),16);
    }
    @Test
    public void maskCardNumberTest1() {
        assertEquals("XXXX XXXX XXXX 6543",number.maskCardNumber(1234567899876543L));
    }
    @Test
    public void maskCardNumberTest2() {
        assertNotEquals(number.maskCardNumber(1234567899876543L),"1234 5678 9987 6543L");
    }
    @Test
    public void notNullTest1() {
        assertNotNull(number.maskCardNumber(1234567899876543L));
    }
}