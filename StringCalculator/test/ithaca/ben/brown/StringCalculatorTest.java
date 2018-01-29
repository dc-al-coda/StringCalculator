package ithaca.ben.brown;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @org.junit.jupiter.api.Test
    /**
     *
     */
    void addTest(){
        StringCalculator functions = new StringFunctionsImpl();
        //empty string
        String empty = "";
        int result = functions.add(empty);
        assertEquals(0, result, "Empty string doesn't work");
    }

}
