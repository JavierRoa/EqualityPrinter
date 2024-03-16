public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
    private static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {

        String result;

        if(firstNumber<0 || secondNumber<0 || thirdNumber<0) {
            result = "Invalid Value";
        }
        else if(firstNumber == secondNumber && firstNumber == thirdNumber) {
            result = "All numbers are equal";
        }
        else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            result = "All numbers are different";
        }
        else {
            result = "Neither are all equal or different";
        }
        System.out.println(result);
    }
}
