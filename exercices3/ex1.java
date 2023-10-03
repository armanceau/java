package exercices3;

public class ex1 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else if(i % 5 == 0) {
                System.out.print("Buzz ");
            }
            else if((i % 5 == 0)&&(i % 3 == 0)) {
                System.out.print("FizzBuzz ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
