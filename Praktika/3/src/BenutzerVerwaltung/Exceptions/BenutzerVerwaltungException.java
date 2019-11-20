package BenutzerVerwaltung.Exceptions;

/**
 * <p>Überschrift: Exception Klasse für BenutzerVerwaltung.BenutzerVerwaltung </p>
 * <p>Beschreibung: handelt die BenutzerVerwaltung.Exceptions der BenutzerVerwaltung.BenutzerVerwaltung.
 * Die Klasse besteht nur aus einem Konstruktor der die entsprechende
 * Exception wirft.</p>
 * <p>Copyright: Marko Kozlowski Copyright (c) 2019</p>
 * @author Marko Kozlowski
 * @version 1.0
 */

public class BenutzerVerwaltungException extends Exception {
    public BenutzerVerwaltungException(String exc){
        super(exc);
    }

}
