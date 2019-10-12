public class Aufgabe2 {
    public static void main(String[] args) {
        if(true|| 5/0 == 0) {// oder mit SEC
            System.out.println("SEC Test");
        }
        if(true|5/0 == 0){// oder ohne SEC durch null teilen geht nicht!
            System.out.println("Ohne SEC");
        }
        }
    }
