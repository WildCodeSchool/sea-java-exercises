package quests.livecoding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class LiveCoding {

    public static void main(String[] args) throws IOException {
        File input = new File("src/test/resources/kunden.csv");
        if (input.exists()) {
            // Dateneingabe aus CSV-Datei
            List<String> zeilen = Files.readAllLines(input.toPath());
            // Datentransformation
            List<Kunde> kundenListe = new ArrayList<>();
            for (int index = 0; index < zeilen.size(); index++) {
                // System.out.println(zeilen.get(index));
                // [0]=='OMS57YPF3TJ', [1]=='Stuart Walls', [2]=='libero@aliquet.com'
                String[] parameter = zeilen.get(index).split(",");

                if (parameter.length >= 3) {
                    Kunde kunde = new Kunde(parameter[0], parameter[1], parameter[2]);
                    kundenListe.add(kunde);
                }
            }
            // Datenausgabe
            System.out.println(kundenListe);
            writeListeToFile(kundenListe, "src/test/resources/ausgabe.csv");
        }
    }

    public static void writeListeToFile(List<Kunde> kundenListe, String path) throws IOException {
        File output = new File(path);
        Writer fileWriter = new FileWriter(output);
        for (Kunde kunde : kundenListe) {
            fileWriter.write(kunde.toCsv() + System.lineSeparator());
        }
        fileWriter.close();
    }

}
