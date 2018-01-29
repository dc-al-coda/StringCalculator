package ithaca.ben.brown;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @org.junit.jupiter.api.Test
    /**
     *
     */
    void addTest(){
        StringCalculator functions = new StringCalculatorImpl();
        //empty string
        String empty = "";
        int result = functions.add(empty);
        assertEquals(0, result, "Empty string doesn't work");

        //string with one item
        String oneItem;
        for(int x = -1; x < 2; x++){
            oneItem = Integer.toString(x);
            result = functions.add(oneItem);
            assertEquals(x, result, "String with one item does not work");
        }

        //string with two items
        String twoItems;
        int sum;
        for(int x = -1; x < 2; x++){
            for(int y = -1; y < 2; y++){
                sum = x+y;
                twoItems = Integer.toString(x) + "," + Integer.toString(y);
                result = functions.add(twoItems);
                assertEquals(sum, result, "String with two items does not work");
            }
        }
    }

}
