import java.util.Scanner; // Scanner Import zum einlesen von der Konsole
public class P1 {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in); // Scanner anlegen
        // final int  eingabe = in.nextInt();//Einlesen beim nächsten Integer wert
        //System.out.println(eingabe);
        //aufgabe1(eingabe);
        //aufgabe2();
        aufgabe3();
    }

    private static void aufgabe1(int tiefe) {
        //var  zum einlesen der tiefe
        int n = tiefe;//vars zum berechnen des Dreiecks // (n) der Wert steht in der Nten zeile  und in dem k-ten kästchen
        int k = 0;// Siehe schleife                        (k)
        //Array anlegen
        int[][] dreieck = new int [n][];
        for(int i = 0; i<tiefe;i++){//2. Dimensionbegrenzen
            dreieck[i] = new int [i+1];
        }


        for(int i = 0; i< n; i++){//Zeilen äußere Schleife
            dreieck[i][0] = 1;//Die erste Zeile immer auf 1 setzen
            if( i != 0) {
                k = i;
            }
            for(int j = 0; j< k; j++){//Spalten Innere Schleife
                if (dreieck[i][k] != 1){//Wenn die letzte Spalte nicht 1 ist setzen wir die auf 1
                    dreieck[i][k] = 1;
                }
                if(dreieck[i][j] == 0){//Abfrage ob der Zwischenwert berechnet werden muss und abbruch...
                    //Wenn 0 dann berechne die Inneren werte..
                    dreieck[i][j] = dreieck[i-1][j-1] + dreieck[i-1][j];
                }
            }
        }

        //Print...
        k=0;// reset k
        for(int i = 0; i < tiefe;i++){
            if( i != 0) {
                k = i;
            }
            for(int j = 0; j <= k ; j++){
                System.out.print(dreieck[i][j] + " ");
            }
            System.out.println();
        }



    }
    private static void aufgabe2() {
        KreisVererb kreis = new KreisVererb(10,10,5); //Einen neuen Kreis erstellen...
        KreisVererb kreissec = new KreisVererb(12,12,8); // Einen 2. Kreis erstellen...



        //Testfall für Equals
        if(kreis.equals(kreissec)){
            System.out.println("Kreis ist ==  Kreissec");
        }else {
            System.out.println("Kreis != Kreissec");
        }


        //Ausgaben Tests
        System.out.println(kreis.toStrings());
        System.out.println(kreissec.toStrings());

        kreis.setRadius(100);
        kreis.setLocation(1337,1337);
        System.out.println( "Radius auf 100 und Loc 1337 "+kreis.toStrings());
    }
    private static void aufgabe3() {
        KreisAgg kreis1 = new KreisAgg(10,10,5);
        KreisAgg kreis2 = new KreisAgg(12,11,7);

        Rechteck recht1 = new Rechteck(1,3,4,1);
        Rechteck recht2 = new Rechteck(2,4,5,2);

        Figuren[] arr = {kreis1,kreis2,recht1,recht2};
        double result = 0.0;
        for(int i = 0; i < arr.length;i++){
            result += arr[i].flächenInhalt();
        }
        System.out.println(Math.round(result));

    }

}
