package exercices3;

public class ex2 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Attention ! Utilisation : java exercise2 <minimum> <maximum>.");
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        if(min > max){
            System.out.println("Attention ! le nombre minimum ne peut pas être supérieur au nombre maximum."); 
            return;
        }

        try {

            for (int i = min; i <= max; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("Buzz ");
                } else {
                    System.out.print(i + " ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Les arguments doivent être des nombres entiers.");
        }
        
    }
}
