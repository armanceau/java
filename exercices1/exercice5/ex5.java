package exercices1.exercice5;

public class ex5 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Integer i = 0;

        while (i < str.length()) {
            System.out.print(str.charAt(i+1));
            i += 2;
        }
    }
}
