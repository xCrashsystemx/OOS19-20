import BenutzerVerwaltung.Benutzer;
import BenutzerVerwaltung.BenutzerVerwaltungAdmin;
import BenutzerVerwaltung.Exceptions.BenutzerVerwaltungException;

import java.io.Serializable;

//TODO: Exc mit großbuchstaben anfangen
public class main implements Serializable {//Main funktion mit testfällen...
    public static void main(String[] args) {
        BenutzerVerwaltungAdmin admin = new BenutzerVerwaltungAdmin();
        //Test user anlegen...
        Benutzer benutzer1 = new Benutzer();
        Benutzer benutzer2 = new Benutzer("", "123".toCharArray() );
        Benutzer benutzer3 = new Benutzer("Dave", "".toCharArray());
        Benutzer benutzer4 = new Benutzer("Okayhan", "hallo".toCharArray());
        Benutzer benutzer5 = new Benutzer("Okayhan", "hallo".toCharArray());
        Benutzer benutzer6 = new Benutzer("Marko", "hallo".toCharArray());
        Benutzer benutzer7 = new Benutzer("Marko", "hallo".toCharArray());

//        System.out.println(benutzer4.toString());//ToString test..
//        System.out.println(benutzer4.equals(benutzer5));//Equals test
//        System.out.println(benutzer4.equals(benutzer6));

//        try {
////            admin.benutzerEintragen(benutzer5);
////            admin.benutzerEintragen(benutzer6);
//        } catch (BenutzerVerwaltungException e) {
//            e.printStackTrace();
//        }
        admin.read();
        System.out.println(admin.getUserList().toString());



    }

}
