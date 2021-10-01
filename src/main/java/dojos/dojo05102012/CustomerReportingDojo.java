package dojos.dojo05102012;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerReportingDojo {

    public static void main(String[] args) throws Exception {
        File inputKunden = new File("src/test/resources/kunden_reporting.csv");
        List<String> kunden = Files.readAllLines(inputKunden.toPath());

    }

}
