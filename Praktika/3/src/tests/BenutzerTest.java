package tests;
import BenutzerVerwaltung.Benutzer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * <p>Überschrift: Klasse zum Testen der Methoden von Benutzer. </p>
 * <p>Beschreibung:  JUint tests aller Funktionen
 *
 *</p>
 *
 * <p>Copyright: Marko Kozlowski Copyright (c) 2019</p>
 * @author Marko Kozlowski
 * @version 1.0
 */

@DisplayName("BenutzerVerwaltung.Benutzer Tests...")
class BenutzerTest{

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEquals() {
        Benutzer user1 = new Benutzer("user1", "fassi".toCharArray());
        Benutzer user2 = new Benutzer("user1", "fassi".toCharArray());
        assertNotSame(user1,user2);
        assertEquals(user1,user2);
        user1 = user2;
        assertNotNull(user1);
        assertSame(user1,user2);
        assertTrue(user1.equals(user2));

        Benutzer user3 = new Benutzer("user3", "blabla.".toCharArray());
        assertNotEquals(user1,user3);
        assertFalse(user1.equals(user3));

    }

    @Test
    void testToString() {
        Benutzer user1 = new Benutzer("user1", "fassi".toCharArray());
        assertEquals(user1.toString(),"userID: " + user1.userId + "\nPasswort: " +
                String.copyValueOf(user1.passWort) );

    }


    @Test
    void testBenutzer(){
        //Konstruktortest..
        Benutzer user1 = new Benutzer("user1","fassi".toCharArray());
        assertEquals("user1", user1.userId);
        assertEquals("fassi", String.valueOf(user1.passWort));

    }
}