package dojos.dojo05102012.util;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private DateUtil() {}

    public static String convertLocalDateToString(LocalDate date) {
        return date.format(formatter);
    }

    public static LocalDate convertStringToLocalDate(String dateString) throws DateTimeParseException {
        return LocalDate.parse(dateString, formatter);
    }

}
