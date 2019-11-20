package BenutzerVerwaltung;

import java.io.Serializable;

/**
 * <p>Überschrift: Struktur von Benutzern </p>
 * <p>Beschreibung: Diese Klasse definiert die grundlegende Struktur von
 * Benutzern.
 * Die Struktur eines Benutzers setzt sich zusammen aus:
 * - der UserId und
 * - dem Passwort
 * Da es nur um eine Struktur geht, werden lediglich die
 * beiden Standardmethoden equals und toString
 * implementiert.</p>
 *
 * <p>Copyright: Marko Kozlowski Copyright (c) 2019</p>
 * @author Marko Kozlowski
 * @version 1.0
 */
public class Benutzer implements Serializable {//BenutzerVerwaltung.Benutzer Klasse siehe PDF

    /**
     * Attribut zur Speicherung der UserID:
     */
   public String userId;

   /**
     * Attribut zur Speicherung des Passworts:
     */
    public char[] passWort;

    /**
     * liefert noch Ausgabe, dass er in Standardkonstruktor ist
     */
    public Benutzer(){
    }

    /**
     * Konstruktor der direkt ein Objekt mit den Werten userId und passWort anlegt.
     */
    public Benutzer(String user, char[] pass){//Konstruktor zum anlegen mit beiden Parametern
        this.userId = user;
        this.passWort = pass;
    }


    /**
     * Standardmethode
     * @param obj liefert das Objekt, dessen Inhalte mit denen des
     * aktuellen Objekts verglichen werden sollen.
     * @return liefert den Vergleichswert true oder false.
     */
    @Override
    public boolean equals(Object obj) {//Vergleichsmethode
        Benutzer ben = (Benutzer) obj;
        if(obj instanceof Benutzer) {
            return (this.toString().equals(ben.toString()));
        }else{
            return false;
        }
    }
    /**
     * Standardmethode
     * @return gibt das aktuelle Objekt als String wieder.
     * Ausgabe in Form von -> userId -> passWort
     */
    @Override
    public String toString(){
        return ("userID: " + this.userId + "\nPasswort: " +
                String.copyValueOf(this.passWort));






}
}
