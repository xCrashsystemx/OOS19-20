package BenutzerVerwaltung;
import BenutzerVerwaltung.Exceptions.*;
import java.io.*;
import java.util.ArrayList;
/**
 * <p>Überschrift: Klasse zum verwalten von Benutzern. </p>
 * <p>Beschreibung: Diese Klasse definiert die Verwaltung
 * von Benutzern, wenn man Admin rechte hat.
 * Die  Klassen Struktur setzt sich zusammen aus:
 * - benutzerEintragen
 * - benutzerOk
 *</p>
 *
 * <p>Copyright: Marko Kozlowski Copyright (c) 2019</p>
 * @author Marko Kozlowski
 * @version 1.0
 */
public class BenutzerVerwaltungAdmin
        implements BenutzerVerwaltung {
    //ArrayLust  für die BenutzerVerwaltung.Benutzer...
    private ArrayList<Benutzer> userList = new ArrayList<Benutzer>();

    public ArrayList<Benutzer> getUserList(){
        return userList;
    }
    public void setUserList(ArrayList<Benutzer> userlist){
        this.userList = userlist;
    }

    /**
     * Standardmethode zum Eintragen von neuen Benutzern..
     * @param benutzer ist das Objekt was in die ArrayList eingetragen wird.
     *
     */
    @Override
    public void benutzerEintragen(Benutzer benutzer)
            throws BenutzerVerwaltungException {
        if (benutzer == null) {// Wenn BenutzerVerwaltung.Benutzer Null ist...
            throw new BenutzerNullPointerException();
        }
        //Wenn ein  BenutzerVerwaltung.Benutzer mit leeren attributen angelegt wurde...
        else if ((benutzer.passWort == null) ||
                (benutzer.passWort.length == 0) &&
                        (benutzer.userId.isEmpty()) ||
                (benutzer.userId == null)) {
            throw new BenutzerEmptyException();
        }//Wenn ein BenutzerVerwaltung.Benutzer mit leeren Passwort angelegt wurde...
        else if (benutzer.passWort.length == 0 ||
                benutzer.passWort == null) {
            throw new BenutzerNoPassException();
        } else if (benutzer.userId.isEmpty() || benutzer.userId == null) {
            throw new BenutzerNoIdException();
        } else {//Duplikat abfrage und danach abspeichern...
            if (userList.contains(benutzer)) {
                //Wenn ein dup = true ist werfe exc...
                throw new benutzerDupException();
            } else {//Alle tests überstanden schreibe in die
                //Arraylist
                this.userList.add(benutzer);

            }
        }
    }

    /**
     * Standardmethode um zu überprüfen ob der Benutzer schon in der Liste ist
     * @param benutzer ist das Objekt nach dem in der ArrayList gesucht wird.
     * @return gibt True zurück falls der User bereits in der Liste ist
     */
    @Override
    public boolean benutzerOk(Benutzer benutzer) {
        return (this.userList.contains(benutzer));
    }

    /**
     * Standardmethode um einen Benutzer aus der Liste zu löschen
     * @param benutzer ist das Objekt das aus der Liste gelöscht.
     */
    public void benutzerLöschen(Benutzer benutzer) throws BenutzerVerwaltungException {
        if (benutzerOk(benutzer)) {
            this.userList.remove(benutzer);
        } else {
            throw new BenutzerNotFoundException();
        }
    }


    /**
     * Standardmethode um die Datenbank zu intialsieren..
     * Userlist wird gesäubert und danach wird direkt in die DB geschrieben
     */
    public void dbInitialisieren(){
        userList.clear();// Aktuelle Userlist leeren
        write();//Leere datei anlegen
    }


    /**
     * Standardmethode um in die Datenbank zu schreiben.
     * Mittels File und Objectstreams wird die Arraylist direkt in die Datei geschrieben
     */
    public void write(){

        try {
            FileOutputStream fs = new FileOutputStream("Users");
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            oos.writeObject(userList);
            fs.close();
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Standardmethode um von der Datenbank zu lesen...
     * und um das gelesene in die Aktuelle UserList zu speichern
     */
    public void read(){
        try {
            FileInputStream fs = new FileInputStream("Users");
            ObjectInputStream ois = new ObjectInputStream(fs);

            this.setUserList((ArrayList<Benutzer>)ois.readObject());
            fs.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}