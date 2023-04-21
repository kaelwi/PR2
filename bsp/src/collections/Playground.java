package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Playground {
    public static void main(String[] args) {
        // Die Klasse Collections stellt ein paar nützliche Methoden zur Verfügung
        // Hier z.B. sort() und reverse()
        // Für mehr -> Strg+Mausklick auf Collections
        // 1. Satz in Dokumentation: This class consists exclusively of static methods that operate on or return collections.
        System.out.println("Collections sort and reverse");
        ArrayList<Integer> donations = new ArrayList<>();
        donations.add(1000);
        donations.add(200);
        donations.add(550);

        Collections.sort(donations);
        System.out.println(donations);

        Collections.reverse(donations);
        System.out.println(donations);

        System.out.println();

        // Vorführung von Set
        // Aus Dokumentation: A collection that contains no duplicate elements.
        System.out.println("Set");

        Set<String> names = new HashSet<>();

        // Mouseover by "Anna" -> IntelliJ meldet schon, dass es ein "Duplicate set element" ist
        names.add("Anna");
        names.add("Maria");
        names.add("Helena");
        names.add("Anna");

        System.out.println(names);

        System.out.println();

        // Vorführung von Map
        // Aus Dokumentation: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
        System.out.println("Map");

        Map<String, Integer> phonenr = new HashMap<>();
        phonenr.put("Max", 1234567);
        phonenr.put("Emily", 664223344);
        phonenr.put("Sandra", 31688445);
        phonenr.put("Adam", 99876);

        System.out.println(phonenr);
        // Returns a {@link Set} view of the mappings contained in this map.
        System.out.println(phonenr.entrySet());
        // Returns a {@link Set} view of the keys contained in this map
        System.out.println(phonenr.keySet());
        // Returns a {@link Collection} view of the values contained in this map
        System.out.println(phonenr.values());

        // Associates the specified value with the specified key in this map
        //     * (optional operation).  If the map previously contained a mapping for
        //     * the key, the old value is replaced by the specified value.
        // Wenn Key noch nicht in Map -> fügt ein neues Key-Value Pair ein
        // Wenn Key bereits vorhanden -> Value zum Key wird mit mit neuem Wert ersetzt
        phonenr.put("Max", 0);
        System.out.println(phonenr);
        System.out.println(phonenr.containsKey("Max"));
        System.out.println(phonenr.containsKey("David"));

        System.out.println();

        // Iterieren über alle Einträge in Map (über entrySet) -> Zugriff auf Key und Value
        for (Map.Entry<String, Integer> e : phonenr.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println();

        // Iterieren über keySet -> Zugriff auf Value über .get()
        for (String name : phonenr.keySet()) {
            System.out.println(name + ": " + phonenr.get(name));
        }

        System.out.println();

        System.out.println("Word count");

        WordCount wordCount = new WordCount("Hallo Welt und nochmal Hallo und Welt und ahoi. Hallo.");
        wordCount.convertTextToMap();
        System.out.println(wordCount.getCount());

    }
}
