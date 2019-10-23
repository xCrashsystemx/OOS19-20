import java.util.Scanner; // Scanner Import zum einlesen von der Konsole
public class P1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner anlegen
        final int  eingabe = in.nextInt();//Einlesen beim nächsten Integer wert
        System.out.println(eingabe);
        aufgabe1(eingabe);
      //aufgabe2();
      //aufgabe3();
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

    }
    private static void aufgabe3() {

    }

}
