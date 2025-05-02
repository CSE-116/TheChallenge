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
//        assertEquals("000010101", bitShift("010101010",true,4));
//        assertEquals("000010101", bitShift("010101010",true,4));

    }

    @Test
    public void bitShiftLeft(){

    }

    @Test
    public void bitRotationRight(){

    }

    @Test
    public void bitRotationLeft(){

    }

    @Test
    public void xorTest(){

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
