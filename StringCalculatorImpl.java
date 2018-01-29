package ithaca.ben.brown;

public class StringCalculatorImpl implements StringCalculator {

    public int add(String numbers){
        /**Adds numbers in a string
         * The string will have a comma between numbers*/
        if(numbers.length() == 0) {
            return 0;
        }
        else{
            int sum = Integer.parseInt(numbers);
            return sum;
        }
    }
}
