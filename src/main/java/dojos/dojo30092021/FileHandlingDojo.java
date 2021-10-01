package dojos.dojo30092021;

import dojos.dojo30092021.ExklusivKunde;
import dojos.dojo30092021.Kunde;
import dojos.dojo30092021.StandardKunde;
import dojos.dojo30092021.ViKunde;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandlingDojo {

    public static void main(String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        List<Kunde> kundenListe = new ArrayList<>();

        Kunde kunde1 = new Kunde("ID1", "Donalds", "donald@duck.de");
        Kunde kunde2 = new Kunde("ID2", "Arnold", "arnold@duck.de");
        Kunde kunde3 = new Kunde("ID3", "Zensy", "zensy@duck.de");

        kundenListe.add(kunde1);
        kundenListe.add(kunde2);
        kundenListe.add(kunde3);

        for (Kunde kunde : kundenListe) {
            System.out.println(kunde.getName());
        }

        // Comparator
        Collections.sort(kundenListe, new KundeNamenslaengeComparator());

        for (Kunde kunde : kundenListe) {
            System.out.println(kunde.getName());
        }

    }





































    /*
     * Advanced Version with Reflection
     * Can create all kind of Kunden, eg.
     *
     * List<Kunde> kunden = addKunden(standardKunden, StandardKunde.class);
     * kunden.addAll(addKunden(exklusivKunden, ExklusivKunden.class)
     * kunden.addAll(addKunden(viKunden, ViKunden.class)
     *
     */
    public static List<Kunde> addKunden(List<String> kundenImport, Class clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Kunde> kunden = new ArrayList<>();
        for(int i = 1; i < kundenImport.size(); i++){
            String[] temp = kundenImport.get(i).split(",");
            Kunde kunde = (Kunde) clazz.getDeclaredConstructor(String.class, String.class, String.class).newInstance(temp[0], temp[1], temp[2]);
            kunden.add(kunde);
        }
        return kunden;
    }

}
