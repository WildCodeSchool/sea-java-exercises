package livecoding;

import java.util.Comparator;

public class ApfelByAlterComparator implements Comparator<Apfel> {
    @Override
    public int compare(Apfel o1, Apfel o2) {
        return Integer.compare(o1.getAlter(), o2.getAlter());
    }
}
