package livecoding;

import java.util.*;

public class AnonymousClassesSample {

    public static void main(String[] args) {
        Apfel apfel1 = new Apfel("A", 1);
        Apfel apfel2 = new Apfel("Boskop", 2);

        List<Apfel> apfelKorb = new ArrayList<>();
        apfelKorb.add(apfel1);
        apfelKorb.add(apfel2);

        Comparator<Apfel> apfelComparator1 = new Comparator<Apfel>() {
            @Override
            public int compare(Apfel o1, Apfel o2) {
                return 1;
            }
        };

        // Alternative zu anonymous inner classes: Lambdas
        Collections.sort(apfelKorb, apfelComparator1);

        AnonymousClassesSample.Entry entry = new Entry();
        entry.setInnerValue(8);

        Map<Integer, String> kunden = new HashMap<>();
        kunden.put(1, "Donald");
        kunden.put(2, "Daisy");

        for (Map.Entry<Integer, String> mapEntry : kunden.entrySet()) {
            System.out.println(mapEntry.getKey() + ":" + mapEntry.getValue());
        }
    }

    private static class Entry {

        private int v;

        public void setInnerValue(int i) {
            v = i;
        }
    }

}
