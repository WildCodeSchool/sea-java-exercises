package livecoding;

import dojos.dojo05102012.Kunde;
import dojos.dojo05102012.ViKunde;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Erstelle einen Printer für beliebige Objekte
        Printer allesPrinter = new Printer();


        // Erstelle einen typ-sicheren Kundenprinter
        Printer<Kunde> kundePrinter = new Printer();
        Kunde zuDruckenderKunde = new ViKunde("ID", "Name", "email", LocalDate.now(), LocalDate.now());
        kundePrinter.print(zuDruckenderKunde);

        // Erstelle einen typ-sicheren Kundenprinter
        Printer<Apfel> apfelPrinter = new Printer();
        Apfel apfel = new Apfel("a", 1);
        apfelPrinter.print(apfel);
        Apfel apfel1 = new Apfel("b", 2);
        apfelPrinter.print(apfel1);

        Kunde letzterGedruckterKunde = kundePrinter.lastPrinted();
        Apfel letzterGedruckterApfel = apfelPrinter.lastPrinted();

        // Negativbeispiel Objektliste, diese Liste kann beliebige Objekte beinhalten
        List list = new ArrayList();
        list.add("ich bin ein String");
        list.add(5);
        list.add(2.3d);

        // Achtung, hier muss ich implizit wissen, dass es ein Double ist, sonst gibt es einen Laufzeitfehler
        Double aDouble = (Double) list.get(2);

        // Hier ist spezifiziert, welche Elemente enthalten sein dürfen, Fehler zur Laufzeit sind nicht möglich!
        List<String> zeilen = new ArrayList<>();
        zeilen.add("super witz");
        List<Double> zahlen = new ArrayList<>();
        zahlen.add(2.3d);
        List<Integer> integer = new ArrayList<>();
        integer.add(6);
    }

    /**
     * Beispiel für eine Methode ohne Beschränkung der Objekttypen in der Liste.
     *
     * @param zeilen
     */
    public void listAusgabeObject(List zeilen) {
        for (Object zeile : zeilen) {
            System.out.println(zeile);
            // Hier muss eine explizite Abfrage erfolgen, es muss auch darauf reagiert werden, dass keine Strings enthalten sind.
            if (zeile instanceof String) {
                // Hier muss ein expliziter Cast erfolgen, was Validierungen durch den Compiler unmöglich macht.
                System.out.println(((String)zeile).length());
            }
        }
    }

    /**
     * Beispiel mit spezifierter Signatur.
     *
     * @param zeilen
     */
    public void listAusgabeGenerics(List<String> zeilen) {
        // Es können nur Strings vorhanden sein, kein Cast notwendig.
        for (String zeile : zeilen) {
            System.out.println(zeile);
            // String-spezifische Methoden (length()) können genutzt werden, da ja nur Strings vorhanden.
            System.out.println(zeile.length());
        }
    }

}
