package BenutzerVerwaltung.Exceptions;

public class BenutzerNullPointerException extends  BenutzerVerwaltungException {
    public BenutzerNullPointerException() {
        super("Keine gültige Referenz zum BenutzerVerwaltung.Benutzer gefunden.");
    }
}
