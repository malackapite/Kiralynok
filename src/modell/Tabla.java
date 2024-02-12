package modell;

public class Tabla {
    
    private char[][] t;
    private char uresCella;

    public Tabla(char UresCella) {
        t = new char[8][8];
        this.uresCella = UresCella;
        for (char[] oszlop : t) {
            for (int ix=0; ix < oszlop.length; ix++) {
                oszlop[ix] = this.uresCella;
            } 
        }
    }
    
    public String getTabla(){
        String tmp="";
        for (char[] oszlop : t) {
            for (char sor : oszlop) {
                tmp += sor;
            } 
            tmp+="\r\n";
        }
        return tmp;
    }
}
