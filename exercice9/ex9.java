package exercice9;

public class ex9 {
    public static void main(String[] args) {
        int[] numbers = {21565, 3412, 180, 1556, 182, 84, 15};
        boolean first = true;

        for (int number : numbers) {
            if (number % 3 != 0) {
                if (!first) {
                    System.out.print(", ");
                } else {
                    first = false;
                }
                System.out.print(number);
            }
        }
    } 
}
