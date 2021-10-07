package dojos.dojo05102012;

import java.time.LocalDate;

public abstract class StandardKunde extends Kunde {

    public StandardKunde(String id, String name, String email, LocalDate geburtstag, LocalDate letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    @Override
    public double berechneRabatt(int wert) {
        return wert;
    }

}

