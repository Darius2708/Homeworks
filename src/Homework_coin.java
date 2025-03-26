import java.util.*;

public class Homework_coin {

    public static int minCoins(int[] monede, int suma) {
        Arrays.sort(monede);
        int numarMonede = 0;
        for (int i = monede.length - 1; i >= 0; i--) {
            while (suma >= monede[i]) {
                suma -= monede[i];
                numarMonede++;
            }
        }
        return numarMonede;
    }

    public static void main(String[] args){
        int[] monede = {1, 5, 10, 25};
        int suma = 63;
        System.out.println("Numarul minim de monede pentru " + suma + " centi: " + minCoins(monede, suma));

        suma = 93;
        System.out.println("Numarul minim de monede pentru " + suma + " centi: " + minCoins(monede, suma));
    }
}
