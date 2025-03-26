import java.util.*;

class Student {
    String prenume, nume, sex, dataNastere, CNP, adresa;
    int varsta;

    Student(String prenume, String nume, String sex, int varsta, String dataNastere, String CNP, String adresa) {
        this.prenume = prenume;
        this.nume = nume;
        this.sex = sex;
        this.varsta = varsta;
        this.dataNastere = dataNastere;
        this.CNP = CNP;
        this.adresa = adresa;
    }
}

class Profesor {
    String prenume, nume, sex, dataNastere, CNP, adresa;
    int varsta;

    Profesor(String prenume, String nume, String sex, int varsta, String dataNastere, String CNP, String adresa) {
        this.prenume = prenume;
        this.nume = nume;
        this.sex = sex;
        this.varsta = varsta;
        this.dataNastere = dataNastere;
        this.CNP = CNP;
        this.adresa = adresa;
    }
}

class Curs {
    String nume, orar, durata, descriere;
    Profesor profesor;

    Curs(String nume, String orar, String durata, String descriere, Profesor profesor) {
        this.nume = nume;
        this.orar = orar;
        this.durata = durata;
        this.descriere = descriere;
        this.profesor = profesor;
    }
}

class Elev {
    String nume;
    int id;
    List<Integer> note = new ArrayList<>();

    Elev(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    void adaugaNota(int nota) {
        note.add(nota);
    }

    double media() {
        if (note.isEmpty()) return 0;
        int suma = 0;
        for (int nota : note) suma += nota;
        return (double) suma / note.size();
    }
}

class ContBancar {
    String numeDetinator;
    double sold;
    List<String> tranzactii = new ArrayList<>();

    ContBancar(String numeDetinator, double soldInitial) {
        this.numeDetinator = numeDetinator;
        this.sold = soldInitial;
        tranzactii.add("Depunere initiala: " + soldInitial);
    }

    void depunere(double suma) {
        sold += suma;
        tranzactii.add("Depunere: " + suma);
    }

    void retragere(double suma) {
        if (suma <= sold) {
            sold -= suma;
            tranzactii.add("Retragere: " + suma);
        }
    }

    double verificaSold() {
        return sold;
    }
}

class Antrenament {
    String tip;
    int durata, distantaSauGreutate;

    Antrenament(String tip, int durata, int distantaSauGreutate) {
        this.tip = tip;
        this.durata = durata;
        this.distantaSauGreutate = distantaSauGreutate;
    }
}

class UtilizatorFitness {
    String nume;
    List<Antrenament> antrenamente = new ArrayList<>();

    UtilizatorFitness(String nume) {
        this.nume = nume;
    }

    void adaugaAntrenament(String tip, int durata, int distantaSauGreutate) {
        antrenamente.add(new Antrenament(tip, durata, distantaSauGreutate));
    }
}


public class Homework_25_03 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Exercitiul 1");
        System.out.println();

        Profesor profesor = new Profesor("Ion", "Popescu", "M", 40, "01.01.1984", "1234567890123", "Strada X");
        Curs curs = new Curs("Matematica", "Luni 10:00", "2 ore", "Curs de algebra", profesor);

        System.out.println("Profesor: " + profesor.nume + " " + profesor.prenume);
        System.out.println("Curs: " + curs.nume + " - " + curs.orar);

        System.out.println();
        System.out.println("Exercitiul 2");
        System.out.println();

        Elev elev = new Elev("Maria", 1);
        elev.adaugaNota(9);
        elev.adaugaNota(10);
        System.out.println("Media lui " + elev.nume + " este: " + elev.media());

        System.out.println();
        System.out.println("Exercitiul 3");
        System.out.println();

        ContBancar cont = new ContBancar("Andrei", 1000);
        cont.depunere(500);
        cont.retragere(200);
        System.out.println("Sold curent: " + cont.verificaSold());

        System.out.println();
        System.out.println("Exercitiul 4");
        System.out.println();

        UtilizatorFitness user = new UtilizatorFitness("Alex");
        user.adaugaAntrenament("Alergare", 30, 5);
        System.out.println("Antrenament adaugat pentru " + user.nume);
    }

}
