package quests.livecoding;

public class Kunde extends Object {

    private String id;
    private String name;
    private String mail;

    public Kunde(String id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.mail;
    }

    public String toCsv() {
        return this.id + "," + this.name + "," + this.mail;
    }

    public String getName() {
        return this.name;
    }
}
