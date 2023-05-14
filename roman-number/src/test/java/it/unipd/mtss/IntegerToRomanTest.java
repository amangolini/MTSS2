package it.unipd.mtss;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void testConvertOne() {
        //Arrange
        int one = 1;
        //Act
        String result = IntegerToRoman.convert(one);
        //Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvertFour() {
        //Arrange
        int four = 4;
        //Act
        String result = IntegerToRoman.convert(four);
        //Assert
        assertEquals("IV", result);
    }

    @Test
    public void testConvertEleven() {
        //Arrange
        int eleven = 11;
        //Act
        String result = IntegerToRoman.convert(eleven);
        //Assert
        assertEquals("XI", result);
    }

    @Test
    public void testConvert143() {
        //Arrange
        int num = 143;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("CXLIII", result);
    }

    @Test
    public void testConvert615() {
        //Arrange
        int num = 615;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("DCXV", result);
    }

    @Test
    public void testConvert999() {
        //Arrange
        int num = 999;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        assertEquals("CMXCIX", result);
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnZero() {
        //Arrange
        int num = 0;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnNegativeNumber() {
        //Arrange
        int num = -100;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        fail();
    }

    @Test(expected = NullPointerException.class)
    public void testConvertFailOnNullNumber() {
        //Arrange
        Integer num = null;
        //Act
        String result = IntegerToRoman.convert(num);
        //Assert
        fail();
    }
}