package dojos.dojo05102012;

import java.time.LocalDate;
import java.util.Date;

public class JuniorKunde extends StandardKunde {

    public JuniorKunde(String id, String name, String email, LocalDate geburtstag, LocalDate letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    public double berechneRabatt(int wert){
        return wert;
    }
}
