import java.util.Scanner;

public class Hw06_03_probl_11_13 {
    public static void main(String[] args){
        System.out.println("Exercitiul 11");
        System.out.println();

        Scanner sc1 = new Scanner(System.in);

        double total1 = 0;
        int count = 0;

        while (true) {
            System.out.print("Introdu un numar (0 pentru a opri): ");
            double num = sc1.nextDouble();

            if (num == 0) {
                break;
            }

            total1 += num;
            count++;
        }

        if (count > 0) {
            double average = total1 / count;
            System.out.println("Media numerelor este: " + average);
        } else {
            System.out.println("Nu s-au introdus numere.");
        }

        System.out.println();
        System.out.println("Exercitiul 12");
        System.out.println();

        Scanner sc2 = new Scanner(System.in);

        double total2 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introdu numarul " + i + ": ");
            double num = sc2.nextDouble();

            if (num <= 5) {
                continue;
            }

            total2 += num;
        }

        System.out.println("Suma numerelor mai mari de 5 este: " + total2);

        System.out.println();
        System.out.println("Exercitiul 13");
        System.out.println();

        char[][] labirint = {
                {'S', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', '0', 'E'}
        };
        if (gasesteDrum(labirint)) {
            System.out.println("Exista o cale spre iesire!");
        } else {
            System.out.println("Nu exista solutie!");
        }
    }

    public static boolean gasesteDrum(char[][] labirint) {
        int n = labirint.length;
        boolean[][] vizitat = new boolean[n][n];
        return cautaDrum(labirint, 0, 0, vizitat);
    }

    public static boolean cautaDrum(char[][] labirint, int x, int y, boolean[][] vizitat) {
        if (x < 0 || y < 0 || x >= labirint.length || y >= labirint[0].length || labirint[x][y] == '1' || vizitat[x][y]) {
            return false;
        }
        if (labirint[x][y] == 'E') {
            return true;
        }
        vizitat[x][y] = true;
        return cautaDrum(labirint, x + 1, y, vizitat) || cautaDrum(labirint, x - 1, y, vizitat) ||
                cautaDrum(labirint, x, y + 1, vizitat) || cautaDrum(labirint, x, y - 1, vizitat);
    }
}