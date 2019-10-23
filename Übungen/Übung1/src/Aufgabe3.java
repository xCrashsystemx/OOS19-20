import java.util.Scanner;//Zum einlesen von der Konsole
public class Aufgabe3 {
    //Methode für Primzahlen
    public static int Prim(int index){//Index = Nte Primzahl, wir fangen direkt bei 2 an, weil 1 sinnlos ist.
    for(int zahl = 2; zahl <= index; zahl++){
        for(int teiler = 2; zahl<= teiler;teiler++){
            if(zahl%teiler == 0 && zahl != teiler) break;
            if(zahl == teiler) return  zahl;
        }
    }
    return 404;
}

    //Primfaktorenzerlegung
    public static void main(String[] args) {
        //Den Integer Wert von der Konsole einlesen
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(Prim(input));
    }
}
