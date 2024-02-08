package drugstore;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private final List<Component> components = new ArrayList<>();
    private int index;


    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
            index++;
        }
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

//    @Override
//    public int compare(Component o1, Component o2) {
//        return o1.getPower() - o2.getPower();
//    }

//    @Override
//    public int compareTo(Pharmacy o) {
//        return Integer.compare(components.size(), o.components.size());
//    }

    @Override
    public int compareTo(Pharmacy o) {
        int fullPowerLast = 0;
        int fullPowerThis = 0;
        for (Component c : this.components) fullPowerThis += c.getPower();
        for (Component c: o.components) fullPowerLast += c.getPower();
        return Integer.compare(fullPowerThis, fullPowerLast);
//        if (fullPowerThis > fullPowerLast) return 1;
//        else if (fullPowerThis < fullPowerLast) return -1;
//        else return 0;
    }
    public int compareToVolume(Pharmacy that) {
        int volumeThis = 0;
        int volumeThat = 0;
        for (Component c : this.components) volumeThis += c.getVolume();
        for (Component c : that.components) volumeThat += c.getVolume();
        return Integer.compare(volumeThis,volumeThat);

    }


    @Override
    public Iterator<Component> iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Object next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "Pharmacy Components = \n" + components + ", Index = " + index + "\n";
    }
}