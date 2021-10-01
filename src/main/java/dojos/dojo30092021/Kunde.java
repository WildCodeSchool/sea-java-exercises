package dojos.dojo30092021;

public abstract class Kunde {

    // attributes
    protected String id;

    protected String name;

    protected String email;
    // constructor

    public Kunde(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract double berechneRabatt(int wert);

}
