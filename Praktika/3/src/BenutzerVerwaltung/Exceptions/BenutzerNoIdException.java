package BenutzerVerwaltung.Exceptions;

public class BenutzerNoIdException extends BenutzerVerwaltungException {
    public BenutzerNoIdException() {
        super("BenutzerVerwaltung.Benutzer hat keine ID.");
    }
}
