package events;

public class Demo {
    public static void main(String[] args) {
        Event e1 = new Event(EventType.KONZERT, "Event 1", "Graz", 38.9);
        Event e2 = new Event(EventType.REISE, "Event 2", "London", 349.5);
        Event e3 = new Event(EventType.KONZERT, "Event 3", "Wien", 108.8);
        Event e4 = new Event(EventType.VORTRAG, "Event 4", "Graz", 108.8);

        EventCalendar eventCalendar = new EventCalendar();
        eventCalendar.add(e1);
        eventCalendar.add(e2);
        eventCalendar.add(e3);


        eventCalendar.print();

        Event event2 = eventCalendar.getByTitle("Event 2");
        System.out.println(event2);
        // Gleich wie oben:
        // System.out.println(eventCalendar.getByTitle("Event 2"));
        System.out.println();

        eventCalendar.print(eventCalendar.getByType(EventType.KONZERT));

        eventCalendar.add(e4);
        eventCalendar.print(eventCalendar.getByOrt("Graz"));

        Event event = eventCalendar.getMostExpensive();
        System.out.println(eventCalendar.getMostExpensive());

        eventCalendar.print();
        eventCalendar.removeExpensive3(100);
        eventCalendar.print();
    }
}
