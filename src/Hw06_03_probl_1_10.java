import java.util.*;
public class Hw06_03_probl_1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Exercitiul 1");
        System.out.println();

        int numar = scanner.nextInt();
        System.out.println(numar % 2 == 0 ? "Par" : "Impar");

        System.out.println();
        System.out.println("Exercitiul 2");
        System.out.println();

        System.out.println("Introdu un numar intre 1 si 12: ");
        int luna = scanner.nextInt();
        String[] luni = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        System.out.println((luna >= 1 && luna <= 12) ? luni[luna - 1] : "Luna invalida");

        System.out.println();
        System.out.println("Exercitiul 3");
        System.out.println();

        int[] numere = {-2, 4, -5, 7, -9, 3};
        int countNegativ = 0;
        for (int n : numere) {
            if (n < 0) countNegativ++;
        }
        System.out.println("Numere negative: " + countNegativ);

        System.out.println();
        System.out.println("Exercitiul 4");
        System.out.println();

        scanner.nextLine();
        String text = scanner.nextLine();
        char[] caractere = text.toCharArray();
        for (int i = caractere.length - 1; i >= 0; i--) {
            System.out.print(caractere[i]);
        }

        System.out.println();
        System.out.println("Exercitiul 5");
        System.out.println();

        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        System.out.println();
        System.out.println("Exercitiul 6");
        System.out.println();

        int suma = 0, input;
        do {
            input = scanner.nextInt();
            if (input != -1) suma += input;
        } while (input != -1);
        System.out.println("Suma numerelor introduse: " + suma);

        System.out.println();
        System.out.println("Exercitiul 7");
        System.out.println();

        int numarCorect = 7;
        int ghicire;
        do {
            ghicire = scanner.nextInt();
            if (ghicire < numarCorect) System.out.println("Prea mic!");
            else if (ghicire > numarCorect) System.out.println("Prea mare!");
        } while (ghicire != numarCorect);
        System.out.println("Felicitari, ai ghicit!");

        System.out.println();
        System.out.println("Exercitiul 8");
        System.out.println();

        a = 0; b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        System.out.println();
        System.out.println("Exercitiul 9");
        System.out.println();

        for (int x : numere) {
            System.out.println(x + " " + (x % 2 == 0 ? "Par" : "Impar"));
        }

        System.out.println();
        System.out.println("Exercitiul 10");
        System.out.println();

        while (true) {
            System.out.println("1. Afiseaza 'Hello World' \n 2. Afiseaza numele \n 3. Iesire");
            int optiune = scanner.nextInt();
            switch (optiune) {
                case 1 -> System.out.println("Hello World");
                case 2 -> {
                    scanner.nextLine();
                    String nume = scanner.nextLine();
                    System.out.println("Numele tau este: " + nume);
                }
                case 3 -> { System.out.println("Iesire..."); return; }
                default -> System.out.println("Optiune invalida!");
            }

        }
    }
}