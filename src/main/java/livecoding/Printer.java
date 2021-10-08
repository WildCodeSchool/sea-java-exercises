package livecoding;

public class Printer<T> {

    private T letztesGedrucktesObjekt;

    public void print(T zuDruckendesObjekt) {
        System.out.println(zuDruckendesObjekt);
        letztesGedrucktesObjekt = zuDruckendesObjekt;
    }

    public T lastPrinted() {
        return letztesGedrucktesObjekt;
    }
}
