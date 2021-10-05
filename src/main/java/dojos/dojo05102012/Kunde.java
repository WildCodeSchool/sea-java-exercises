package dojos.dojo05102012;
import java.util.Date;

public abstract class Kunde {

    private String id;
    private String name;
    private String email;
    private Date geburtstag;
    private Date letzterKauf;

    public Kunde(String id, String name, String email, Date geburtstag, Date letzterKauf) {
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

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public Date getLetzterKauf() {
        return letzterKauf;
    }

    public void setLetzterKauf(Date letzterKauf) {
        this.letzterKauf = letzterKauf;
    }
    public abstract double berechneRabatt(int wert);

    public String begruesse() {
        return "Hallo, ich bin Kunde " + getName();
    }
}
