package tests;

import static challenge.Challenge.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void bitShiftRight(){
        assertEquals("10101010", bitShift("10101010",true,0));
        assertEquals("10010010", bitShift("100100101",true,1));
        assertEquals("101010", bitShift("10101010",true,2));
        assertEquals("10101", bitShift("10101010",true,3));
        assertEquals("101", bitShift("01010101",true,4));
        assertEquals("100", bitShift("10010101",true,5));
    }

    @Test
    public void bitShiftLeft(){
        assertEquals("10101101", bitShift("10101101",false,0));
        assertEquals("1001010", bitShift("00100101",false,1));
        assertEquals("1010101000", bitShift("10101010",false,2));
        assertEquals("10101010000", bitShift("010101010",false,3));
        assertEquals("10101010000", bitShift("01010101",false,4));
        assertEquals("1001010100000", bitShift("10010101",false,5));
    }

    @Test
    public void bitRotationRight(){
        assertEquals("10101101", bitShift("10101101",true,0));
        assertEquals("10010", bitShift("00100101",true,1));
        assertEquals("101010", bitShift("10101010",true,2));
        assertEquals("10101", bitShift("010101010",true,3));
        assertEquals("101", bitShift("01010101",true,4));
        assertEquals("100", bitShift("10010101",true,5));
    }

    @Test
    public void bitRotationLeft(){
        assertEquals("10101101", bitShift("10101101",false,0));
        assertEquals("1001010", bitShift("00100101",false,1));
        assertEquals("1010101000", bitShift("10101010",false,2));
        assertEquals("10101010000", bitShift("010101010",false,3));
        assertEquals("10101010000", bitShift("01010101",false,4));
        assertEquals("100", bitShift("10010101",true,5));
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
        assertEquals("x+y", multiplexer(false,false));
        assertEquals("xy", multiplexer(false,true));
        assertEquals("x", multiplexer(true,false));
        assertEquals("y", multiplexer(true,true));
    }

    @Test
    public void binaryToDecimalTest(){
        HashMap<String, Integer> test = new HashMap<>();
        test.put("100000",32);
        test.put("101",5);
        test.put("10000111",135);
        test.put("100110010",306);
        test.put("1",1);
        test.put("0",0);

        for(String num : test.keySet()){
            assertEquals(test.get(num), binaryToDecimal(num), .00001);
        }
    }

    @Test
    public void decimalToBinaryTest(){
        HashMap<Integer, String> test = new HashMap<>();

        test.put(32, "100000");
        test.put(5, "101");
        test.put(135, "10000111");
        test.put(306, "100110010");
        test.put(1, "1");
        test.put(0, "0");

        for(int num : test.keySet()){
            assertEquals(test.get(num), decimalToBinary(num));
        }
    }

}
