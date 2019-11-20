package BenutzerVerwaltung.Exceptions;

public class BenutzerNotFoundException extends BenutzerVerwaltungException {
    public BenutzerNotFoundException() {
        super("BenutzerVerwaltung.Benutzer wurde nicht gefunden.");
    }
}
