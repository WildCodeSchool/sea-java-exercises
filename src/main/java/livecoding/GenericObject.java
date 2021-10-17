package livecoding;

public class GenericObject<T> {

    private T apfel;

    public GenericObject() {

    }

    public void setElement(T apfel) {
        this.apfel = apfel;
        System.out.println("apfel gesetzt");
    }
}
