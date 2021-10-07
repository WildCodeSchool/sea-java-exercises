package dojos.dojo05102012;

import java.time.LocalDate;

public class StandardKundeOhnePotential extends StandardKunde{
    public StandardKundeOhnePotential(String id, String name, String email, LocalDate geburtstag, LocalDate letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }

    public double berechneRabatt(int wert){
        return wert;
    }
}
