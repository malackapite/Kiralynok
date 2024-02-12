package modell;

import java.util.Random;

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
    
    public void Elhelyez(int n){
        Random rnd = new Random();
        int kiralynoDb=0;
        while(kiralynoDb<n){
            int sor=rnd.nextInt(t.length);
            int oszlop=rnd.nextInt(t[sor].length);
            if(t[sor][oszlop]!='K')
            {
                t[sor][oszlop] = 'K';
                kiralynoDb++;
            }
        }
    }
}
