package tests;

import static challenge.Challenge.*;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void bitShiftRight(){
        assertEquals("101010101001010101101", bitShift("101010101001010101101",true,0));
        assertEquals("101010010010", bitShift("1010100100101",true,1));
        assertEquals("10101010", bitShift("1010101010",true,2));
        assertEquals("10101", bitShift("010101010",true,3));
        assertEquals("100101", bitShift("1001010101",true,4));
        assertEquals("10101010101001100", bitShift("1010101010100110010101",true,5));
    }

    @Test
    public void bitShiftLeft(){
        assertEquals("101010101001010101101", bitShift("101010101001010101101",false,0));
        assertEquals("10101001001010", bitShift("1010100100101",false,1));
        assertEquals("101010101000", bitShift("1010101010",false,2));
        assertEquals("10101010000", bitShift("010101010",false,3));
        assertEquals("10010101010000", bitShift("1001010101",false,4));
        assertEquals("101010101010011001010100000", bitShift("1010101010100110010101",false,5));
    }

    @Test
    public void bitRotationRight(){

    }

    @Test
    public void bitRotationLeft(){

    }

    @Test
    public void xorTest(){
        assertFalse(xor(false,false));
        assertTrue(xor(false,true));
        assertTrue(xor(true,false));
        assertFalse(xor(true,true));
    }

    @Test
    public void multiplexerTest(){

    }

    @Test
    public void binaryToDecimal(){

    }

    @Test
    public void decimalToBinary(){

    }

}
