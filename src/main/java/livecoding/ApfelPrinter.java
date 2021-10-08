package livecoding;

public class ApfelPrinter {

    private Apfel letztesGedrucktesObjekt;

    public void print(Apfel zuDruckendesObjekt) {
        System.out.println(zuDruckendesObjekt);
        letztesGedrucktesObjekt = zuDruckendesObjekt;
    }

    public Apfel lastPrinted() {
        return letztesGedrucktesObjekt;
    }

}
