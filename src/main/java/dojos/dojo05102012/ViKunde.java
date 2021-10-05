package dojos.dojo05102012;

import java.util.Date;

public class ViKunde extends Kunde {
    public ViKunde(String id, String name, String email, Date geburtstag, Date letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    @Override
    public double berechneRabatt(int wert) {
       return wert * 0.8;
    }
}
