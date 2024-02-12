package modell;

public class Tabla {
    
    private char[][] t;
    private char uresCella;

    public Tabla(char UresCella) {
        t = new char[8][8];
        this.uresCella = UresCella;
        for (char[] oszlop : t) {
            for (char sor : oszlop) {
                sor = this.uresCella;
            } 
        }
    }
    
    
}
