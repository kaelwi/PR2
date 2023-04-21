package collections;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private String text;
    private Map<String, Integer> count;

    public WordCount(String text) {
        this.text = text;
        // vor dem new HashMap<>() ist count null
        this.count = new HashMap<>();
    }

    public void convertTextToMap() {
        removeDiacritics();
        // Die split Methode teilt ein String in Teile auf, wobei in der Klammer angegeben wird, was den String aufteilen soll
        // wir wollen einzelne Wörter -> daher in Klammer Leerzeichen (Achtung, nicht leerer String in Klammer)
        // Ein Array wird zurückgegeben
        String[] splitText = text.split(" ");
        // das Array von text.split() wird durchgelaufen
        for (int i = 0; i < splitText.length; i++) {
            // für jedes Wort im Array wird geprüft, ob es dafür schon einen Eintrag in der Map gibt
            if (count.get(splitText[i]) == null) {
                // Wenn noch kein Eintrag, wird hier ein Key-Value Paar hinzugefügt
                count.put(splitText[i], 0);
            }
            // Dank dem Hinzufügen in Zeile 26 können wir hier count.get() anstelle des Wertes aufrufen
            // .put() ersetzt den alten Wert in der Map mit dem hier angegebenen neuen Wert
            // wir wollen den Wert in der Map um 1 erhöhen -> also holen wir den alten und addieren 1 hinzu
            count.put(splitText[i], count.get(splitText[i])+1);
        }
    }

    // Methode ist private, weil sie nur innerhalb der Klasse WordCount benötigt wird
    private void removeDiacritics() {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            // behalte alles, was Leerzeichen oder Buchstabe ist -> entfernt Satzzeichen und Nummer
            if (text.charAt(i) == ' ' || Character.isLetter(text.charAt(i))) {
                newText += text.charAt(i);
            }
        }
        this.text = newText;
    }

    public Map<String, Integer> getCount() {
        return count;
    }
}
