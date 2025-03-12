import java.util.HashMap;
import java.util.Arrays;

public class Homework_11_03_Expert_Level {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Exercitiul 1");
        System.out.println();

        String mesaj = "salut";
        int shift = 3;
        StringBuilder cifrat = new StringBuilder();
        for (char c : mesaj.toCharArray()) {
            cifrat.append((char) (c + shift));
        }
        System.out.println("Cifrat: " + cifrat.toString());

        StringBuilder decifrat = new StringBuilder();
        for (char c : cifrat.toString().toCharArray()) {
            decifrat.append((char) (c - shift));
        }
        System.out.println("Decifrat: " + decifrat.toString());

        System.out.println();
        System.out.println("Exercitiul 2");
        System.out.println();

        String camelCase = "exempluTestVariabila";
        StringBuilder snakeCase = new StringBuilder();
        for (char c : camelCase.toCharArray()) {
            if (Character.isUpperCase(c)) {
                snakeCase.append("_").append(Character.toLowerCase(c));
            } else {
                snakeCase.append(c);
            }
        }
        System.out.println("Rezultat: " + snakeCase.toString());

        System.out.println();
        System.out.println("Exercitiul 3");
        System.out.println();

        String comprimare = "a3b2c4";
        StringBuilder expandat = new StringBuilder();
        for (int i = 0; i < comprimare.length(); i += 2) {
            char litera = comprimare.charAt(i);
            int numar = Character.getNumericValue(comprimare.charAt(i + 1));
            for (int j = 0; j < numar; j++) {
                expandat.append(litera);
            }
        }
        System.out.println("Rezultat: " + expandat.toString());

        System.out.println();
        System.out.println("Exercitiul 4:");
        System.out.println();

        String cod = "int x = 5; // variabila x \n /* comentariu \n multilinie */ int y = 10;";
        String codFaraComentarii = cod.replaceAll("//.*|/\\*.*?\\*/", "");
        System.out.println("Rezultat: " + codFaraComentarii.trim());

        System.out.println();
        System.out.println("Exercitiul 5");
        System.out.println();

        String s1 = "listen";
        String s2 = "silent";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean esteAnagrama = Arrays.equals(arr1, arr2);
        System.out.println("Rezultat: " + (esteAnagrama ? "Da" : "Nu"));

        System.out.println();
        System.out.println("Exercitiul 6");
        System.out.println();

        String textToggle = "Salut Lume";
        StringBuilder toggled = new StringBuilder();
        for (char c : textToggle.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }
        System.out.println("Rezultat: " + toggled.toString());
    }

}
