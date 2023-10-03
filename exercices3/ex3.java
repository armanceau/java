package exercices3;

public class ex3 {
    public static void main(String[] args) {
        int count = 0, start = 1, end = 50;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        System.out.println("La somme des nombres pairs entre " + start + " et " + end + " est : " + count);
    
    }
}
