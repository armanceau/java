package exercices2.exercice1;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> stock = new ArrayList<>();

        stock.add(14);
        stock.add(887);
        stock.add(58);
        stock.add(713);
        stock.add(179);
        stock.add(512);
        stock.add(786);
        stock.add(29);

        Integer total = sum(stock);
        System.out.println("Contenu du stock : " + total);
    }

    private static Integer sum(ArrayList<Integer> stock) {
        int sum = 0;
        for(Integer number : stock){
            sum += number;
        }

        return sum;

    }
}
