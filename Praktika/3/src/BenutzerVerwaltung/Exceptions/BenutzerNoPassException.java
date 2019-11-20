package BenutzerVerwaltung.Exceptions;

public class BenutzerNoPassException extends BenutzerVerwaltungException {
    public BenutzerNoPassException() {
        super("BenutzerVerwaltung.Benutzer hat kein Passwort.");
    }
}
