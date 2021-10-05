package dojos.dojo05102012;

import java.util.Date;

public class StandardKundeOhnePotential extends StandardKunde{
    public StandardKundeOhnePotential(String id, String name, String email, Date geburtstag, Date letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    public double berechneRabatt(int wert){
        return wert;
    }
}
