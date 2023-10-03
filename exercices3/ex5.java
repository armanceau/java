package exercices3;

import java.util.ArrayList;

public class ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(75);
        number.add(80);
        number.add(90);
        number.add(95);
        number.add(85);
        
        float averageArray = averageCalcul(number);
        System.out.println("La moyenne de la liste est : " + averageArray);
    }

    private static float averageCalcul(ArrayList<Integer> number) {
        int sum = 0;
        int nbElement = number.size();

        for (Integer num : number) {
            sum += num;
        }

        return sum/nbElement;
    }

}
