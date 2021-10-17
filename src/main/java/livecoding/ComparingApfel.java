package livecoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingApfel {

    public static void main(String[] args) {
        Apfel apfel1 = new Apfel("boskopp", 12);
        Apfel apfel2 = new Apfel("pink lady", 13);

        ArrayList<Apfel> aepfel = new ArrayList<>();
        aepfel.add(apfel1);
        aepfel.add(apfel2);



        GenericObject<Apfel> meineGenericObject = new GenericObject<>();
        meineGenericObject.setElement(apfel1);
        meineGenericObject.setElement(apfel2);



        //Collections.sort(aepfel, Comparator.comparing(Apfel::getName).thenComparing(Apfel::getAlter));
    }

}
