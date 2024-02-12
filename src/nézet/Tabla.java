package nézet;

import java.io.File;
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
            int oszlop=rnd.nextInt(t.length);
            int sor=rnd.nextInt(t[oszlop].length);
            if(t[oszlop][sor]!='K')
            {
                t[oszlop][sor] = 'K';
                kiralynoDb++;
            }
        }
    }
    
    public boolean uresOszlop(int oszlop){
        int ix=0;
        while(ix <t[0].length && t[ix][oszlop]!='K') {
            ix++;
        }
        return ix<t.length;
    }
    
    public boolean uresSor(int sor){
        int ix=0;
        while(ix <t.length && t[sor][ix]!='K') {
            ix++;
        }
        return ix<t.length;
    }
    
    public int getUresOszlopokSzama(){
        int db=0;
        for (int ix = 0; ix < t[0].length; ix++) {
            if(uresOszlop(ix))
                db++;
        }
        return db;
    }
    
    public int getUresSorokSzama(){
        int db=0;
        for (int ix = 0; ix < t.length; ix++) {
            if(uresSor(ix))
                db++;
        }
        return db;
    }
}
