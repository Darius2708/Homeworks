import java.util.HashMap;
import java.util.HashSet;

public class Homework_11_03_Medium_Level {
    public static void main(String[] args){
        System.out.println("Exercitiul 1");
        System.out.println();

        String text = "Salut lume";
        String vechi = "lume";
        String nou = "Java";
        text = text.replace(vechi, nou);
        System.out.println("Rezultat: " + text);

        System.out.println();
        System.out.println("Exercitiul 2");
        System.out.println();

        String textOriginal = "banana";
        StringBuilder rezultat = new StringBuilder();
        HashSet<Character> caractereVazute = new HashSet<>();

        for (char c : textOriginal.toCharArray()) {
            if (!caractereVazute.contains(c)) {
                caractereVazute.add(c);
                rezultat.append(c);
            }
        }
        System.out.println("Rezultat: " + rezultat.toString());

        System.out.println();
        System.out.println("Exercitiul 3");
        System.out.println();

        String fraza = "Salut lume";
        String deInserat = " frumoasa";
        int index = 5;
        StringBuilder sb = new StringBuilder(fraza);
        sb.insert(index, deInserat);
        System.out.println("Rezultat: " + sb.toString());

        System.out.println();
        System.out.println("Exercitiul 4");
        System.out.println();

        String textFrecventa = "hello world";
        HashMap<Character, Integer> frecventa = new HashMap<>();

        for (char c : textFrecventa.toCharArray()) {
            frecventa.put(c, frecventa.getOrDefault(c, 0) + 1);
        }
        for (var entry : frecventa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Exercitiul 5");
        System.out.println();

        HashMap<Character, String> codMorse = new HashMap<>();
        codMorse.put('A', ".-"); codMorse.put('B', "-..."); codMorse.put('C', "-.-.");
        codMorse.put('D', "-.."); codMorse.put('E', "."); codMorse.put('F', "..-.");
        codMorse.put('G', "--."); codMorse.put('H', "...."); codMorse.put('I', "..");
        codMorse.put('J', ".---"); codMorse.put('K', "-.-"); codMorse.put('L', ".-..");
        codMorse.put('M', "--"); codMorse.put('N', "-."); codMorse.put('O', "---");
        codMorse.put('P', ".--."); codMorse.put('Q', "--.-"); codMorse.put('R', ".-.");
        codMorse.put('S', "..."); codMorse.put('T', "-"); codMorse.put('U', "..-");
        codMorse.put('V', "...-"); codMorse.put('W', ".--"); codMorse.put('X', "-..-");
        codMorse.put('Y', "-.--"); codMorse.put('Z', "--.."); codMorse.put(' ', " /");

        String mesaj = "salut";
        StringBuilder codificat = new StringBuilder();

        for (char c : mesaj.toUpperCase().toCharArray()) {
            if (codMorse.containsKey(c)) {
                codificat.append(codMorse.get(c)).append(" ");
            }
        }
        System.out.println("Rezultat: " + codificat.toString().trim());
    }
}
