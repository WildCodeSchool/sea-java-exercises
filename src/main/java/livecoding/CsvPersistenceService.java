package livecoding;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CsvPersistenceService {

    /**
     * Returns empty List if excption occurs.
     *
     * @param input
     * @return empty list...
     */
    public List<String> importFile(File input) {
        List<String> csvLines = new ArrayList<>();
        try {
            csvLines = Files.readAllLines(input.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvLines;
    }
}
