package dojos.dojo07102021;

import livecoding.Apfel;

public class GenericApfelStorage<T extends Apfel> {

    private T erstesElement;

    public void setErstesElement(T element) {
        System.out.println(element.getName());
        this.erstesElement = element;
    }

    public T getErstesElement() {
        return erstesElement;
    }

}
