import java.util.ArrayList;

public class Hw5_3 {

    public static void main(String[] args){
        System.out.println("Exercitiul 1");
        System.out.println();

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println(stringOne == stringTwo);

        System.out.println();
        System.out.println("Exercitiul 2");
        System.out.println();

        int firstNumber = 5, secondNumber = 5;
        System.out.println(firstNumber == secondNumber);
        String firstString = "Hello", secondString = "Hello";
        System.out.println(firstString.equals(secondString));

        System.out.println();
        System.out.println("Exercitiul 3");
        System.out.println();

        int age = 16;
        System.out.println(age >= 18 ? "Sunt major" : "Sunt minor");

        System.out.println();
        System.out.println("Exercitiul 4");
        System.out.println();

        int heightOne = 170, heightTwo = 180;
        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println("Inaltimea maxima este: " + maximumHeight);

        System.out.println();
        System.out.println("Exercitiul 5");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Exercitiul 6");
        System.out.println();

        int temperature = 25;
        System.out.println(temperature > 30 ? "Cald" : (temperature >= 20 ? "Normal" : "Rece"));

        System.out.println();
        System.out.println("Exercitiul 7");
        System.out.println();

        int sideOne = 5, sideTwo = 5, sideThree = 5;
        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Echilateral" :
                (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isoscel" : "Scalen";
        System.out.println("Triunghiul este: " + triangleType);

        System.out.println();
        System.out.println("Exercitiul 8");
        System.out.println();

        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorialul lui " + number + " este: " + factorial);

        System.out.println();
        System.out.println("Exercitiul 9");
        System.out.println();

        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println(countryOne.equals(countryTwo));
        countryTwo = "UK";
        System.out.println(countryOne.equals(countryTwo));

        System.out.println();
        System.out.println("Exercitiul 10");
        System.out.println();

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Apple");
        listOne.add("Banana");

        ArrayList<String> listTwo = listOne;
        listOne.add("Cherry");

        System.out.println("Lista 1: " + listOne);
        System.out.println("Lista 2: " + listTwo);

        System.out.println();
        System.out.println("Exercitiul 11");
        System.out.println();

        int a = 10, b = 20, c = 30, d = 40;
        int additionResult = a + b;
        int multiplicationResult = c * d;
        System.out.println("Suma: " + additionResult);
        System.out.println("Produsul: " + multiplicationResult);

        System.out.println();
        System.out.println("Exercitiul 12");
        System.out.println();

        int number1 = 25;
        int negativeNumber = -number1;
        System.out.println("Numar initial: " + number1);
        System.out.println("Numar negativ: " + negativeNumber);

        System.out.println();
        System.out.println("Exercitiul 13");
        System.out.println();

        boolean isRaining = true, isSunny = false;
        System.out.println("Nu ploua: " + !isRaining);
        System.out.println("Este soare: " + !isSunny);

        System.out.println();
        System.out.println("Exercitiul 14");
        System.out.println();

        int counter = 0;
        counter++;
        System.out.println("Dupa incrementare: " + counter);
        counter--;
        System.out.println("Dupa decrementare: " + counter);

        System.out.println();
        System.out.println("Exercitiul 15");
        System.out.println();

        int total = 100;
        total -= 20;
        System.out.println("Dupa scadere: " + total);
        total *= 2;
        System.out.println("Dupa inmultire: " + total);

        System.out.println();
        System.out.println("Exercitiul 16");
        System.out.println();

        int num = 50;
        num = -num;
        System.out.println("Dupa negare: " + num);
        num = Math.abs(num);
        System.out.println("Dupa valoarea absoluta: " + num);
        num++;
        System.out.println("Dupa incrementare: " + num);

        System.out.println();
        System.out.println("Exercitiul 17");
        System.out.println();

        boolean hasUsername = true;
        boolean hasPassword = false;

        if (hasUsername && hasPassword) {
            System.out.println("Autentificare reusita");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Parola e gresita");
        } else {
            System.out.println("Autentificare nereusita");
        }

        System.out.println();
        System.out.println("Exercitiul 18");
        System.out.println();

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.print("Sirul initial: ");
        for (int num1 : numbers) {
            System.out.print(num1 + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]--;
        }

        System.out.print("Sirul dupa decrementare: ");
        for (int num1 : numbers) {
            System.out.print(num1 + " ");
        }

        System.out.println("\n");
        System.out.println("Exercitiul 19");
        System.out.println();

        int age2 = 20;
        String category = (age2 < 12) ? "Copil" :
                (age2 <= 17) ? "Adolescent" :
                        (age2 <= 64) ? "Adult" : "Batran";
        System.out.println("Categoria: " + category);

        System.out.println();
        System.out.println("Exercitiul 20");
        System.out.println();

        int x = 15, y = 30, z = 25;
        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Cel mai mare numar este: " + largest);

        System.out.println();
        System.out.println("Exercitiul 21");
        System.out.println();

        double score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Nota finala: " + grade);
    }
}
