package livecoding;

/**
 * Klasse ohne weitere Funktion, dient als Beispiel für Generics (Printer).
 */
public class Apfel {

    private String name;

    private int alter;

    public Apfel(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Apfel{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
