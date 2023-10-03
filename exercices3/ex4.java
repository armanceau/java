package exercices3;

public class ex4 {
    public static void main(String[] args) {
        int count = 0, start = 1, end = 10;

        for (int i = start; i <= end; i++) {
            count += i*i;
        }
        System.out.println("La somme des carrés des nombres entre " + start + " et " + end + " est : " + count);
    
    }
}
