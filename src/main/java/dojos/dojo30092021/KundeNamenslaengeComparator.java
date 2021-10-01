package dojos.dojo30092021;

import java.util.Comparator;

public class KundeNamenslaengeComparator implements Comparator<Kunde> {

    @Override
    public int compare(Kunde o1, Kunde o2) {
        int laengeErsterKunde = o1.getName().length();
        int laengeZweiterKunde = o2.getName().length();
        System.out.println("erster Kunde: " + o1.getName() + ", Länge Namen: " + laengeErsterKunde + ", zweiter Kunde: " + o2.getName() + ", Länge: " + laengeZweiterKunde);
        if (laengeErsterKunde == laengeZweiterKunde) {
            System.out.println("0: Sind gleich.");
            return 0; // sind gleich
        } else if (laengeErsterKunde < laengeZweiterKunde) {
            System.out.println("-1: Erster Kunde ist kleiner.");
            return -1; // ich bin kleiner
        } else {
            System.out.println("+1: Zweiter Kunde ist kleiner.");
            return 1; // ich bin größer
        }
    }
}
