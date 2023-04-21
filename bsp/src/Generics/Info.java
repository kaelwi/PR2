package Generics;

// <T> kennzeichnet die type parameters
// es handelt sich hier um eine generische Klasse
// weitere Infos: https://docs.oracle.com/javase/tutorial/java/generics/index.html
public class Info<T> {
    private T data;
    private int securityLevel;

    // dank T können wir in data verschiedene Datentypen haben
    // siehe Demo
    public Info(T data, int securityLevel) {
        this.data = data;
        this.securityLevel = securityLevel;
    }

    public T getData() {
        return data;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}
