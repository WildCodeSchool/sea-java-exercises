package dojos.dojo05102012;

import dojos.dojo05102012.util.DateUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KundeImporter {

    public static List<Kunde> importKunden(File kundenDatei){
        /*
        IF (TYPE='E')
   NEW EXKLUSIVKUNDE
ELSE IF (TYPE='V')
   NEW VIKUNDE
ELSE IF (TYPE='S') AND (AGE < 25)
   NEW JUNIORKUNDE
ELSE IF (TYPE='S') AND (LAST_PURCHASE < 90 DAYS)
   NEW STANDARDKUNDE_MIT_POTENTIAL
ELSE
   NEW STANDARDKUNDE_OHNE_POTENTIAL

   XDF57FEO3VQ,Moses Finch,ipsum.ac@quamvel.co.uk,02.01.2000,01.08.2021,S
         */
        List<String> kundenCSV = null;
        List<Kunde> kundenListe = new ArrayList<>();
        try {
            kundenCSV = Files.readAllLines(kundenDatei.toPath());
            for(String kunde: kundenCSV) {
                String[] temp = kunde.split(",");
                String id = temp[0];
                String name = temp[1];
                String email = temp[2];
                String birthDay = temp[3];
                String lastBuy = temp[4];
                String type = temp[5];

                try {
                    LocalDate birthDate = DateUtil.convertStringToLocalDate(birthDay);
                    LocalDate lastBuyDate = DateUtil.convertStringToLocalDate(lastBuy);
                    if (type.equals("E")) {
                        ExklusivKunde exklusivKunde = new ExklusivKunde(id, name, email, birthDate, lastBuyDate);
                        kundenListe.add(exklusivKunde);
                    } else if (type.equals("V")) {

                    }
                } catch (DateTimeParseException e) {
                    System.err.println("Konnte das Datum für Kunde " + id + " nicht lesen.");
                }

            }
        } catch (IOException e) {
           System.err.println("Could not read file.");
        }
        return kundenListe;
    }
}
