package dojos.dojo05102012;

import java.util.Date;

public abstract class StandardKunde extends Kunde {

    public StandardKunde(String id, String name, String email, Date geburtstag, Date letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    @Override
    public double berechneRabatt(int wert) {
        return wert;
    }

}

