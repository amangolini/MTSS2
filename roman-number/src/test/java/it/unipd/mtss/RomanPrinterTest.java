package it.unipd.mtss;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class RomanPrinterTest {
    @Test
    public void testPrintOneMock() {
        //Arrange
        String roman = "I";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____  \n |_   _| \n   | |   \n   | |   \n  _| |_  \n |_____| \n", result);
    }

    @Test
    public void testPrintOne() {
        //Arrange
        String roman = "I";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____  \n |_   _| \n   | |   \n   | |   \n  _| |_  \n |_____| \n", result);
    }

    @Test
    public void testPrintFour() {
        //Arrange
        String roman = "IV";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____   __      __ \n |_   _|  \\ \\    / / \n   | |     \\ \\  / /  \n   | |      \\ \\/ /   \n  _| |_      \\  /    \n |_____|      \\/     \n", result);
    }

    @Test
    public void testPrintFive() {
        //Arrange
        String roman = "V";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __      __ \n \\ \\    / / \n  \\ \\  / /  \n   \\ \\/ /   \n    \\  /    \n     \\/     \n", result);
    }

    @Test
    public void testPrintNine() {
        //Arrange
        String roman = "IX";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____   __   __ \n |_   _|  \\ \\ / / \n   | |     \\ V /  \n   | |      > <   \n  _| |_    / . \\  \n |_____|  /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrintTen() {
        //Arrange
        String roman = "X";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __   __ \n \\ \\ / / \n  \\ V /  \n   > <   \n  / . \\  \n /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrintForty() {
        //Arrange
        String roman = "XL";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __   __   _       \n \\ \\ / /  | |      \n  \\ V /   | |      \n   > <    | |      \n  / . \\   | |____  \n /_/ \\_\\  |______| \n", result);
    }

    @Test
    public void testPrintFifty() {
        //Arrange
        String roman = "L";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _       \n | |      \n | |      \n | |      \n | |____  \n |______| \n", result);
    }

    @Test
    public void testPrintNinety() {
        //Arrange
        String roman = "XC";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals(" __   __    _____  \n \\ \\ / /   / ____| \n  \\ V /   | |      \n   > <    | |      \n  / . \\   | |____  \n /_/ \\_\\   \\_____| \n", result);
    }

    @Test
    public void testPrintOneHundred() {
        //Arrange
        String roman = "C";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("   _____  \n  / ____| \n | |      \n | |      \n | |____  \n  \\_____| \n", result);
    }

    @Test
    public void testPrintFourHundred() {
        //Arrange
        String roman = "CD";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("   _____    _____   \n  / ____|  |  __ \\  \n | |       | |  | | \n | |       | |  | | \n | |____   | |__| | \n  \\_____|  |_____/ \n", result);
    }

    @Test
    public void testPrintFiveHundred() {
        //Arrange
        String roman = "D";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  _____   \n |  __ \\  \n | |  | | \n | |  | | \n | |__| | \n |_____/ \n", result);
    }

    @Test
    public void testPrintNineHundred() {
        //Arrange
        String roman = "CM";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("   _____    __  __  \n  / ____|  |  \\/  | \n | |       | \\  / | \n | |       | |\\/| | \n | |____   | |  | | \n  \\_____|  |_|  |_| \n", result);
    }

    @Test
    public void testPrintOneThousand() {
        //Arrange
        String roman = "M";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        assertEquals("  __  __  \n |  \\/  | \n | \\  / | \n | |\\/| | \n | |  | | \n |_|  |_| \n", result);
    }

    @Test(expected = InvalidParameterException.class)
    public void testInvalidRoman() {
        //Arrange
        String roman = "XK";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testEmptyString() {
        //Arrange
        String roman = "";
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testNullString() {
        //Arrange
        String roman = null;
        //Act
        String result = RomanPrinter.printAsciiArt(roman);
        //Assert
        fail();
    }
}