package SetCollection;

import java.util.*;

public class SetCollection {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(7);
        set.add(5);

        System.out.println(set.size());

        set.remove(11);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i : set) {

            System.out.println(i);
        }

//        set.clear();

        System.out.println(set.size());

        System.out.println(set.contains(5));
        System.out.println(set.contains(11));
    }
}
