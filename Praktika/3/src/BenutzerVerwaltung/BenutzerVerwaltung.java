package BenutzerVerwaltung;//TODO: JavaDoc
import BenutzerVerwaltung.Exceptions.BenutzerVerwaltungException;


/**
 * <p>Überschrift: Interface Benutzerverwaltung </p>
 * <p>Beschreibung: Dieses Interface Definiert folgende Methoden:
 *
 * - benutzerEintragen
 * - benutzerOK
 * </p>
 *
 * <p>Copyright: Marko Kozlowski Copyright (c) 2019</p>
 * @author Marko Kozlowski
 * @version 1.0
 */
public interface BenutzerVerwaltung {
   void benutzerEintragen(Benutzer benutzer) throws BenutzerVerwaltungException;
   boolean benutzerOk(Benutzer benutzer) throws BenutzerVerwaltungException;

}
