package livecoding;

import java.util.Comparator;

public class ApfelByNameComparator implements Comparator<Apfel> {

    @Override
    public int compare(Apfel o1, Apfel o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
