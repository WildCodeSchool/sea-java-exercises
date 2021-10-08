package livecoding;

/*
 Wird nicht genutzt, dient als Negativbeispiel, dass es ohne Generics für jede Klasse einen eigenen Printer geben müsste.
 */
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
