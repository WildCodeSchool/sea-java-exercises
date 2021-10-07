package dojos.dojo05102012;
import java.time.LocalDate;
import java.util.Date;

public abstract class Kunde {

    private String id;
    private String name;
    private String email;
    private LocalDate geburtstag;
    private LocalDate letzterKauf;

    public Kunde(String id, String name, String email, LocalDate geburtstag, LocalDate letzterKauf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.geburtstag = geburtstag;
        this.letzterKauf = letzterKauf;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }

    public LocalDate getLetzterKauf() {
        return letzterKauf;
    }

    public void setLetzterKauf(LocalDate letzterKauf) {
        this.letzterKauf = letzterKauf;
    }
    public abstract double berechneRabatt(int wert);

    public String begruesse() {
        return "Hallo, ich bin Kunde " + getName();
    }
}
