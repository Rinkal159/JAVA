package Recursion;

public class S_IsValidCreditCard {
    public static boolean isValid(long cardNumber, int pos, int sum) {
        if (cardNumber == 0) {
            if (sum % 10 == 0) {
                return true;
            }
            return false;
        }

        if (pos % 2 != 0) {
            long curr = cardNumber % 10;
            curr *= 2;

            if (curr > 9) {
                while (curr != 0) {
                    sum += (curr % 10);
                    curr /= 10;
                }
            } else {
                sum += curr;
            }

        } else {
            sum += cardNumber % 10;

        }

        return isValid(cardNumber / 10, pos + 1, sum);

    }

    public static void main(String[] args) {
        long cardNumber = 4003600000000014l;

        System.out.println("is Valid Number : " + isValid(cardNumber, 0, 0));

    }
}
