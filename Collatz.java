public class Collatz {
    public static void main(String[] args) {
        int number = 6; // Beginn Zahl

        System.out.print(number + " ");

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (3 * number) + 1;
            }
            System.out.print(number + " ");
        }
    }
}
