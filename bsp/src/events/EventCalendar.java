package events;

import java.util.ArrayList;
import java.util.Iterator;

public class EventCalendar {
    private ArrayList<Event> events;

    public EventCalendar() {
        events = new ArrayList<>();
    }

    // Add Event e to events-List
    public void add(Event e) {
        events.add(e);
    }

    // print events-list
    public void print() {
        for (Event e : events) {
            System.out.println(e);
        }
        System.out.println();
    }

    // print events-list (parameter)
    public void print(ArrayList<Event> events) {
        for (Event e : events) {
            System.out.println(e);
        }
        System.out.println();
    }

    // get event by title (es wird angenommen, es gibt nur 1 event mit diesem titel)
    public Event getByTitle(String title) {
        Event result = null;
        for (Event e : events ) {
            String eventTitle = e.getTitle();
            if (eventTitle.equals(title)) {
                result = e;
                // weil es nur 1 event mit dem titel geben kann, kann man aus der schleife ausbrechen
                break;
            }
        }
        return result;
    }

    // liefert events vom angebenen typ zurück
    public ArrayList<Event> getByType(EventType type) {
        // liste zum befüllen mit events vom typ "type"
        ArrayList<Event> result = new ArrayList<>();
        // alle events durchlaufen
        for (int i = 0; i < events.size(); i++) {
            // if event auf stelle i den typ gleich, wie im parameter hat
            // dann in result-list einfügen
            if (events.get(i).getType().equals(type)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    // liefert events vom angebenen ort zurück
    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<>();
        // alle events durchlaufen
        for (int i = 0; i < events.size(); i++) {
            // if event auf stelle i den ort gleich, wie im parameter hat
            // dann in result-list einfügen
            if (events.get(i).getOrt().equals(ort)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    // hole 1. event, prüfe in schleife, ob es ein event gibt, welches mehr kostet
    // wenn ja, dann überschreibe price und result mit dem teurerem event
    public Event getMostExpensive() {
        double price = events.get(0).getPreis();
        Event result = events.get(0);

        for (Event e : events) {
            if (e.getPreis() > price) {
                price = e.getPreis();
                result = e;
            }
        }

        return result;
    }

    // iterator intro
    public void removeExpensive(double limit) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPreis() > limit) {
                events.remove(events.get(i));
            }
        }
    }

    public void removeExpensive2(double limit) {
        for (Event e : events) {
            if (e.getPreis() > limit) {
                events.remove(e);
            }
        }
    }

    public void removeExpensive3(double limit) {
        Iterator<Event> it = events.iterator();
        while (it.hasNext()) {
            Event event = it.next();
            if (event.getPreis() > limit) {
                it.remove();
            }
        }
    }
}
