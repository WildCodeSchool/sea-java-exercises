package livecoding;

import dojos.dojo05102012.Kunde;
import dojos.dojo05102012.ViKunde;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Printer<Kunde> kundePrinter = new Printer();
        Kunde zuDruckenderKunde = new ViKunde("ID", "Name", "email", LocalDate.now(), LocalDate.now());
        kundePrinter.print(zuDruckenderKunde);

        Printer<Apfel> apfelPrinter = new Printer();
        Apfel apfel = new Apfel();
        apfelPrinter.print(apfel);
        Apfel apfel1 = new Apfel();
        apfelPrinter.print(apfel1);

        Kunde letzterGedruckterKunde = kundePrinter.lastPrinted();
        Apfel letzterGedruckterApfel = apfelPrinter.lastPrinted();

        List list = new ArrayList();
        list.add("ich bin ein String");
        list.add(5);
        list.add(2.3d);

        // Achtung, hier muss ich implizit wissen, dass es ein Double ist.
        Double aDouble = (Double) list.get(2);

        List<String> zeilen = new ArrayList<>();
        zeilen.add("super witz");

        List<Double> zahlen = new ArrayList<>();
        List<Integer> integer = new ArrayList<>();
    }

    public void listAusgabeObject(List zeilen) {
        for (Object zeile : zeilen) {
            System.out.println(zeile);
            if (zeile instanceof String) {
                System.out.println(((String)zeile).length());
            }
        }
    }

    public void listAusgabeGenerics(List<String> zeilen) {
        for (String zeile : zeilen) {
            System.out.println(zeile);
            System.out.println(zeile.length());
        }
    }

}
