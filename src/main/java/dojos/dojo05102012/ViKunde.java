package dojos.dojo05102012;

import java.time.LocalDate;

public class ViKunde extends Kunde {
    public ViKunde(String id, String name, String email, LocalDate geburtstag, LocalDate letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    @Override
    public double berechneRabatt(int wert) {
       return wert * 0.8;
    }
}
