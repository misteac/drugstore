package drugstore.main;

import drugstore.Component;
import drugstore.Pharmacy;
import drugstore.Pharmacy2;
import drugstore.components.*;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicilin = new Penicilin("Penicilin", 1.6D, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);
        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicilin, water);
        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicilin);


//        for (Component c : p2) {
//            System.out.println(c);
//        }

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicilin);
        System.out.println(components);

        // соритровка
        Collections.sort(components);
        System.out.println(components);


        //обратный порядок
        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~HW3~~~~~~~~~~~~~~~~~~~~~~~~~");

        Component aspirine = new Aspirine("Aspirine", 6D, 4);
        Component otrivin = new Otrivin("Otrivin", 4.2D, 7);
        Component nurofen = new Nurofen("Nurofen", 8.0D, 15);

        Pharmacy p4 = new Pharmacy();
        p4.addComponents(aspirine, otrivin);
        Pharmacy p5 = new Pharmacy();
        p5.addComponents(nurofen);
        Pharmacy p6 = new Pharmacy();
        p6.addComponents(water, nurofen, otrivin);

        List<Pharmacy> list = new ArrayList<>();
        list.add(p4);
        list.add(p5);
        list.add(p6);
        System.out.println(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.sort(Pharmacy::compareToVolume);
        System.out.println(list);


//        Comparator<Component> power = new Pharmacy();
//        components2.sort(power);
//        System.out.println(components2);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        Comparator<Component> weight = new WeightCompare();
//        components2.sort(weight);
//        System.out.println(components2);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        Comparator<Component> volume = new VolumeCompare();
//        components2.sort(volume);

//
//        System.out.println(c1);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(c1);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}