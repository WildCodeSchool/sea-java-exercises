package livecoding;

import dojos.dojo05102012.ExklusivKunde;
import dojos.dojo05102012.Kunde;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsGenerics {

    public static void main(String[] args) {

        /*
         * Beispiel für Listen
         */
        Kunde kunde1 = new ExklusivKunde("ID1", "Kunde1", "mail@kunde1.de", LocalDate.now(), LocalDate.now());
        Kunde kunde2 = new ExklusivKunde("ID2", "Kunde2", "mail@kunde2.de", LocalDate.now(), LocalDate.now());

        List<Kunde> alleKunden = new ArrayList<>();
        alleKunden.add(kunde1);
        alleKunden.add(kunde2);

        for (Kunde kunde : alleKunden) {
            if (kunde.getId().equals("ID2")) {
                System.out.println(kunde.getName());
            }
        }

        // Index ist bei List und Array fest auf "int" gesetzt
        Kunde kundeAnStelle2 = alleKunden.get(1);
        System.out.println(kundeAnStelle2);

        /*
         * Beispiel für Maps
         *
         * Nutze Attribut ID als Key
         */
        Map<String, Kunde> idKunden = new HashMap<>();

        idKunden.put("ID1", kunde1);
        idKunden.put("ID2", kunde2);

        if (idKunden.containsKey("ID2")) {
            System.out.println(idKunden.get("ID2").getName());
        }

        // Attribut Email als Key

        Map<String, Kunde> emailKunden = new HashMap<>();

        emailKunden.put("mail@kunde1.de", kunde1);
        emailKunden.put("mail@kunde1.de", kunde2);

        if (idKunden.containsKey("mail@kunde2.de")) {
            System.out.println(idKunden.get("mail@kunde2.de").getName());
        }

        /* Ohne Generics, bis Java 5 einzige Option */

        Map idKundenNoGenerics = new HashMap();

        // Key und Value sind vom Typ "Object", keine weitere Einschränkung möglich
        idKundenNoGenerics.put("ID1", kunde1);
        // Setze einen java.lang.String statt eines Kunden: kein Kompilier-, aber Laufzeitfehler
        idKundenNoGenerics.put("ID2", "kunde2");

        if (idKundenNoGenerics.containsKey("ID2")) {
            Kunde kunde = (Kunde) idKundenNoGenerics.get("ID2");
            System.out.println(kunde.getName());
        }

    }

}
