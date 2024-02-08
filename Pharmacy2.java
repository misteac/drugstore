package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2  implements  Iterable<Component> {
    private final List<Component> components = new ArrayList<>();
    private int index;

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public Iterator<Component> iterator() {    //Анонимный класс Итератор
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
}