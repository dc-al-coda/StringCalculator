package ithaca.ben.brown;

public class StringCalculatorImpl implements StringCalculator {

    public int add(String numbers){
        /**Adds numbers in a string
         * The string will have a comma between numbers, no spaces*/
        if(numbers.length() == 0) {
            return 0;
        }
        else if(numbers.indexOf(',') == -1){
            int sum = Integer.parseInt(numbers);
            return sum;
        }
        else{
            int sum = 0, i1 = 0, i2;
            String sub = "";
            for(int x = 0; x < numbers.length(); x++) {
                if(numbers.charAt(x) == ','){
                    i2 = x;
                    sub = numbers.substring(i1, i2);
                    sum += Integer.parseInt(sub);
                    i1 = x+1;
                }
            }
            i2 = numbers.length();
            sub = numbers.substring(i1, i2);
            sum += Integer.parseInt(sub);
            return sum;
        }
    }
}
