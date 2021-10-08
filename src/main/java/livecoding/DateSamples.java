package livecoding;

import dojos.dojo05102012.Kunde;
import dojos.dojo05102012.util.DateUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateSamples {

    public static void main(String[] args) {
        // Alte API, Vorsicht!
        // Nicht Immutable!
        // Statt nur Datum auch mit Zeit inkl. Millisekunden!

        // Erstelle Date JETZT
        Date date1 = new Date();
        System.out.println("Date1: " + date1);
        System.out.println("Date1 als MS:" + date1.getTime());

        // Erstelle Date JETZT
        Date date2 = new Date();
        System.out.println("Date2: " + date2);
        System.out.println("Date2 als MS: " + date2.getTime());

        if (date1.compareTo(date2) == 0) {
            // wird nicht ausgegeben, weil ein paar Millisekunden Unterschied!
            System.out.println("sind gleich.");
        }

        // Beispiel für Vergleich auf gleicher Tag, Monat, Jahr
        // ACHTUNG, Fehler im Code: Tag ist nicht Tag des Monats, dh. es würde fälschlicherweise am gleichen Tag der Woche im gleichen Monat TRUE zurückgegeben!
        boolean gleicherMonat = date1.getMonth() == date2.getMonth();
        boolean gleichesJahr = date1.getYear() == date2.getYear();
        boolean gleicherTag = date1.getDay() == date2.getDay();

        if (gleicherMonat && gleicherTag && gleichesJahr) {
            System.out.println("sind gleich genug.");
        }

        // JodaTime API wurde in Java 8 größtenteils übernommen
        // Bitte immer nach Möglichkeit LocalDate verwenden!
        LocalDate localDate1 = DateUtil.convertStringToLocalDate("05.10.2021");
        LocalDate localDate3 = LocalDate.of(2021, 10, 07);
        System.out.println("Localdate of " + localDate3);
        LocalDate localDate2 = LocalDate.now();
        LocalTime localtime = LocalTime.of(13, 2);

        // Beispiel für chained method calls
        int days = Period.between(localDate1, localDate3).minusDays(4).plusMonths(2).getDays();

        System.out.println(localtime);

        // Formatierung mit Formatter
        System.out.println(DateUtil.convertLocalDateToString(localDate1));
        System.out.println(localDate2);

        if (localDate1.compareTo(localDate2) == 0) {
            System.out.println("sind genau gleich");
        }

        // mutable / veränderbar bei Dates

        Date vertragsBeginn = ermittleVertragsbeginn(null);
        // verändere den Vertragsbeginn!!!
        vertragsBeginn.setHours(23);

    }

    public static Date ermittleVertragsbeginn(Kunde kunde) {
        return new Date();
    }
}
