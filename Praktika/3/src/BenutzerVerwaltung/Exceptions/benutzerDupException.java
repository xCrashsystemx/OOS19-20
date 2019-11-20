package BenutzerVerwaltung.Exceptions;

public class benutzerDupException extends BenutzerVerwaltungException {
    public benutzerDupException() {
        super("BenutzerVerwaltung.Benutzer existiert schon!");
    }
}
