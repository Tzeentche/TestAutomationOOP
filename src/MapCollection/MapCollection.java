package MapCollection;

import java.util.*;

public class MapCollection {

    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Black");
        mapa.put(2, "White");
        mapa.put(3, "Yellow");
        mapa.put(4, "Black");

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(4));

        System.out.println(mapa.size());
//        mapa.clear();
        System.out.println(mapa.size());

        System.out.println(mapa.containsKey(90));
        System.out.println(mapa.containsKey(3));
        System.out.println(mapa.containsValue("White"));
        System.out.println(mapa.containsValue("Fsfvdf"));

        Set<Integer> keys = mapa.keySet();

        Iterator<Integer> iterator = keys.iterator();

        while(iterator.hasNext()) {

            System.out.println(mapa.get(iterator.next()));

        }

        System.out.println();

        System.out.println(mapa.get(2));
        mapa.put(2, "Purple");
        System.out.println(mapa.get(2));

        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("Filipp", "Gnida");
        mapa2.put("Fedia", "Krasavchil");

        System.out.println();
        System.out.println(mapa2.get("Filipp"));
    }
}
