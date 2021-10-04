package dojos.dojo05102012.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String DATE_PATTERN = "dd.MM.yyyy";

    private DateUtil() {}

    public static String convertDateToString(Date date) {
        return new SimpleDateFormat(DATE_PATTERN).format(date);
    }

    public static Date convertStringToDate(String dateString) throws ParseException {
        return new SimpleDateFormat(DATE_PATTERN).parse(dateString);
    }

}
