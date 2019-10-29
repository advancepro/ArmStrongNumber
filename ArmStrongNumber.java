package sample;

public class ArmStrongNumber {

    public ArmStrongNumber() {
    }

    public boolean isArmstrongNumber(int input) {
        int number = 5, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else {
            System.out.println(number + " is not an Armstrong number.");

        }
        return false;
    }
}

