package tests;

import BenutzerVerwaltung.Benutzer;
import BenutzerVerwaltung.BenutzerVerwaltungAdmin;
import BenutzerVerwaltung.Exceptions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * <p>Überschrift: Klasse zum Testen der Methoden von BenutzerVerwaltungAdmin. </p>
 * <p>Beschreibung:  JUint tests aller Funktionen
 *
 *</p>
 *
 * <p>Copyright: Marko Kozlowski Copyright (c) 2019</p>
 * @author Marko Kozlowski
 * @version 1.0
 */

class BenutzerVerwaltungAdminTest {
    //Erstelle Variabeln die in der ganzen Klasse
    //Sichtbar sind damit ich Sie in allen Testfällen
    //benutzen kann...
    BenutzerVerwaltungAdmin admin;
    Benutzer userNull;
    Benutzer user1;
    Benutzer user2;
    Benutzer user3;
    Benutzer userEmpty;
    Benutzer userNoID;
    Benutzer userNoPass;

    //Bereite alle Benutzer für jeden Testfall vor...
    @BeforeEach
    void setUp() {
        admin = new BenutzerVerwaltungAdmin();
        userNull = null;
        user1 = new Benutzer("user1","fassi1".toCharArray());
        user2 = new Benutzer("user2","fassi2".toCharArray());
        user3 = new Benutzer("user3","fassi3".toCharArray());
        userEmpty = new Benutzer("","".toCharArray());
        userNoID = new Benutzer("","fassi".toCharArray());
        userNoPass = new Benutzer("usernopass", "".toCharArray());
    }

    @AfterEach
    void tearDown() {
    }

    //Benutzereintragen testen...
    @Test
    void benutzerEintragen() throws BenutzerVerwaltungException {
        //2 User eintragen und BenutzerOK ausführen...
        admin.benutzerEintragen(user1);
        admin.benutzerEintragen(user2);
        assertTrue(admin.benutzerOk(user1));
        assertTrue(admin.benutzerOk(user2));
        //Der eigentliche Test..


        assertThrows(BenutzerNullPointerException.class, () ->
        {
            admin.benutzerEintragen(userNull);
        });
        assertThrows(BenutzerEmptyException.class, () ->
        {
            admin.benutzerEintragen(userEmpty);
        });

        assertThrows(BenutzerNoIdException.class, () ->
        {
            admin.benutzerEintragen(userNoID);
        });

        assertThrows(BenutzerNoPassException.class, () ->
         {
          admin.benutzerEintragen(userNoPass);

         });

    }

    @Test
    void benutzerOk() throws BenutzerVerwaltungException {
        admin.benutzerEintragen(user1);
        admin.benutzerEintragen(user2);
        assertTrue(admin.benutzerOk(user1));
        assertTrue(admin.benutzerOk(user2));
        admin.benutzerLöschen(user1);
        assertFalse(admin.benutzerOk(user1));
        assertTrue(admin.benutzerOk(user2));



    }

    @Test
    void benutzerLöschen() throws BenutzerVerwaltungException {
        admin.benutzerEintragen(user1);
        admin.benutzerEintragen(user2);
        admin.benutzerEintragen(user3);
        admin.benutzerLöschen(user1);
        admin.benutzerLöschen(user2);
        assertFalse(admin.benutzerOk(user1));
        assertFalse(admin.benutzerOk(user2));
        assertTrue(admin.benutzerOk(user3));
        admin.benutzerLöschen(user3);
        assertFalse(admin.benutzerOk(user3));

    }
}