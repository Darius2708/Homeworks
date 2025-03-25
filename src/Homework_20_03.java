import java.util.*;

public class Homework_20_03 {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Exercitiul 1");
        System.out.println();

        String[] listaCumparaturi = {"Lapte", "Paine", "Oua", "Fructe"};
        for (String produs : listaCumparaturi) {
            System.out.println(produs);
        }

        System.out.println();
        System.out.println("Exercitiul 2");
        System.out.println();

        ArrayList<String> listaDorinte = new ArrayList<>();
        listaDorinte.add("Telefon");
        listaDorinte.add("Laptop");
        listaDorinte.add("Bicicleta");
        for (String dorinta : listaDorinte) {
            System.out.println(dorinta);
        }

        System.out.println();
        System.out.println("Exercitiul 3");
        System.out.println();

        ArrayList<String> listaStudenti = new ArrayList<>(Arrays.asList(
                "Ana", "Maria", "Ion", "Vasile", "Elena", "Mihai", "Cristina", "Gabriel", "Laura", "Darius"
        ));
        ArrayList<String> listaAbsolventi = new ArrayList<>(listaStudenti);
        for (String absolvent : listaAbsolventi) {
            System.out.println(absolvent);
        }

        System.out.println();
        System.out.println("Exercitiul 4");
        System.out.println();

        int[] numere = {12, 5, 8, 3, 9, 10, 6, 15, 4, 7};
        int pare = 0, impare = 0;
        for (int numar : numere) {
            if (numar % 2 == 0) pare++;
            else impare++;
        }
        System.out.println("Numere pare: " + pare);
        System.out.println("Numere impare: " + impare);

        System.out.println();
        System.out.println("Exercitiul 5");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> orase = new ArrayList<>(Arrays.asList("Bucuresti", "Cluj", "Iasi", "Brasov", "Timisoara"));
        System.out.print("Introdu un oras: ");
        String orasNou = scanner.nextLine();
        if (orase.contains(orasNou)) {
            System.out.println("Orasul este deja in lista.");
        } else {
            orase.add(orasNou);
        }
        System.out.println(orase);

        System.out.println();
        System.out.println("Exercitiul 6");
        System.out.println();

        LinkedList<String> studenti = new LinkedList<>(Arrays.asList("Alex", "Radu", "Ioana", "Maria", "Diana"));
        System.out.print("Introdu un nume: ");
        String numeCautat = scanner.nextLine();
        if (studenti.remove(numeCautat)) {
            System.out.println("Studentul a fost sters.");
        } else {
            System.out.println("Studentul nu a fost gasit.");
        }
        System.out.println(studenti);

        System.out.println();
        System.out.println("Exercitiul 7");
        System.out.println();

        ArrayList<String> fructe = new ArrayList<>(Arrays.asList("Mar", "Portocala", "Banana", "Struguri", "Kiwi"));
        fructe.sort((a, b) -> {
            if (a.length() == b.length()) return a.compareTo(b);
            return Integer.compare(b.length(), a.length());
        });
        System.out.println(fructe);

        System.out.println();
        System.out.println("Exercitiul 8");
        System.out.println();

        String[] filme = {"Avatar", "Titanic", "Inception", "Interstellar", "Matrix"};
        System.out.print("Introdu un film: ");
        String filmCautat = scanner.nextLine();
        int pozitie = -1;
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].equals(filmCautat)) {
                pozitie = i;
                break;
            }
        }
        if (pozitie != -1) {
            System.out.println("Filmul este la pozitia " + pozitie);
        } else {
            System.out.println("Filmul nu a fost gasit.");
        }

        System.out.println();
        System.out.println("Exercitiul 9");
        System.out.println();

        System.out.print("Introdu un numar binar: ");
        String binar = scanner.nextLine();
        int decimal = Integer.parseInt(binar, 2);
        System.out.println("Numarul in baza 10 este: " + decimal);

        System.out.println();
        System.out.println("Exercitiul 10");
        System.out.println();

        ArrayList<String> jurnal = new ArrayList<>();
        jurnal.add("2025-03-20: Am fost la munte.");
        jurnal.add("2025-03-21: Am citit o carte interesanta.");
        jurnal.add("2025-03-22: Am invatat Java.");
        jurnal.sort(Collections.reverseOrder());
        for (String inregistrare : jurnal) {
            System.out.println(inregistrare);
        }
    }
}
