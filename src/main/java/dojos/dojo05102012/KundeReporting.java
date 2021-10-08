package dojos.dojo05102012;

import java.util.ArrayList;
import java.util.List;

public class KundeReporting {

    public static List<Kunde> filterKunde(List<Kunde> allCustomers, String type){
        List<Kunde> filteredKunde = new ArrayList<>();
        for(Kunde kunde: allCustomers){
            if(type.equals("E") && kunde instanceof ExklusivKunde){
                filteredKunde.add(kunde);
            }
            if(type.equals("V") && kunde instanceof ViKunde){
                filteredKunde.add(kunde);
            }
            if(type.equals("S") && kunde instanceof StandardKunde){
               filteredKunde.add(kunde);
            }
        }

        return filteredKunde;
    }
}
