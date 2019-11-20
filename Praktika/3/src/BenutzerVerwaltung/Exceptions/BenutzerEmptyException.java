package BenutzerVerwaltung.Exceptions;

public class BenutzerEmptyException extends BenutzerVerwaltungException {
    public BenutzerEmptyException() {
        super("Für den BenutzerVerwaltung.Benutzer sind keine Daten hinterlegt.");
    }
}
