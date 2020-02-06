// @E.Voinu
/*
* Last Digit Checker
* Write a method hasSameLastDigit with three parameters of type int.
* Each number should be in the range of 10(inclusive)- 1000(inclusive).
* If one of the numbers is not within the range the method should return false
* Method should return true if at least two of the numbers share the rightmost digit, otherwise,
* it should return false.
* Write a second method isValid with one parameter of type int
* the method should return true if the parameter is in range of 10(inclusive)- 1000(inclusive)
* otherwise,it should return false.
* */

public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)){

            int num1LastDigit = num1 % 10;
            int num2LastDigit = num2 % 10;
            int num3LastDigit = num3 % 10;

            return num1LastDigit == num2LastDigit || num2LastDigit == num3LastDigit
                    || num1LastDigit == num3LastDigit;
        }
        return false;

    }// end of hasSameLastDigit

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    } // end isValid method

    public static void main(String[] args) {
        System.out.println(isValid(10001));
        System.out.println(hasSameLastDigit(9, 99, 19));
    }

}// end class