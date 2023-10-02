package exercice6;

public class ex6 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Integer i = str.length() - 1;

        while (i >= 0) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}
