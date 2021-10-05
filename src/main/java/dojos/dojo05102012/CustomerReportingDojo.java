package dojos.dojo05102012;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CustomerReportingDojo {

    public static void main(String[] args) {
        File inputKunden = new File("src/test/resources/kunden_reporting.csv");
        List<Kunde> kundenListe = KundeImporter.importKunden(inputKunden);

        for (Kunde kunde : kundenListe) {
            //System.out.println(kunde.begruesse());
            System.out.println(kunde.berechneRabatt(100));
            if (kunde instanceof ExklusivKunde) {
                //System.out.println("Ich bin exklusiv!");
            }
        }
        // For instructions see README_DOJO.md
        // For Datehandling use DateUtil.convertStringToDate(...)

        /*
1. Create classes and class dependencies as described in the diagram
   * All Kunden have *ID*, *name*, *email address*, *birthdate* and *lastPurchase* date
   * The following types of Kunden exists: `StandardKunde`, `ExklusivKunde`, `VIKunde`, `JuniorKunde`
   * There are two specializations of `StandardKunde`: `StandardKundeMitPotential` and `StandardKundeOhnePotential`
   * All Kunden implement a `berechneRabatt(int wert)` method, which calculates and returns the discount depending on the type of Kunde
   * The type of Kunde is determined by the last column of the CSV file: S,E,V

         */

    }

}
