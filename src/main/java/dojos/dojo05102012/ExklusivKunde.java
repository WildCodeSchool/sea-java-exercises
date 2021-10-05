package dojos.dojo05102012;

import java.util.Date;

public class ExklusivKunde extends Kunde{
    public ExklusivKunde(String id, String name, String email, Date geburtstag, Date letzterKauf) {
        super(id, name, email, geburtstag, letzterKauf);
    }


    public double berechneRabatt(int wert) {
        return wert * 0.9;
    }

    @Override
    public String begruesse() {
        return "Ich bin ein Exklusiv-Kunde: " + getName();
    }
}
