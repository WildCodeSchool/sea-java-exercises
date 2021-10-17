package dojos.dojo07102021;

import livecoding.Apfel;
import livecoding.CsvPersistenceService;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestFileIO {

    @Test
    public void testReadFile() {
        // Arrange
        File input = new File("src/test/resources/myfile.csv");
        CsvPersistenceService csvPersistenceService = new CsvPersistenceService();

        // Act
        List<String> csvLines = csvPersistenceService.importFile(input);

        // Assert
        assertNotNull(csvLines, "csvLines war null");
        assertTrue(csvLines.size() > 0, "Liste hatte keine Elemente.");
        assertEquals(2, csvLines.size(), "Liste hatte nicht genau 2 Elemente.");
        //assertEquals("dasistein;csv;datei", csvLines.get(0));
        for (String line : csvLines) {
            assertTrue(line.contains(";"), "Kein CSV: " + line);
        }
    }

    @Test
    public void testGenerics() {
        // User

        // Objects withut Generics
        List csvLines = new ArrayList();
        csvLines.add("csv;line;ben");

        csvLines.add(3);

        csvLines.add(LocalDate.now());
        csvLines.add(5.6);

        // String string = (String)csvLines.get(3);

        List<String> realCsvLines = new ArrayList<String>();
        realCsvLines.add("csv;line;ben");
        //realCsvLines.add(3);
        //realCsvLines.add(LocalDate.now());

        // String realString = realCsvLines.get(1);

        List<Integer> integers = new ArrayList<>();
        //integers.add("uiuhui");
        integers.add(3);

        Map<String, LocalDate> zuordnung = new HashMap<>();
        zuordnung.put("morgen", LocalDate.now().plusDays(1));

        // Creator


        GenericApfelStorage<Apfel> storage = new GenericApfelStorage();
        storage.setErstesElement(new Apfel("apfel", 66));







    }
}
