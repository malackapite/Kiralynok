package modell;

import nézet.Tabla;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fajl {
    private int db;
    private char uresNegyzet;
    private Tabla[] tabla;
    
    public Fajl(char uresNegyzet, int db) {
        this.db = db;
        this.uresNegyzet = uresNegyzet;
        tabla= new Tabla[db];
        for (int ix = 0; ix < db; ix++) {
            new Tabla(uresNegyzet);
            tabla[ix].Elhelyez(ix);
        }
    }
    
    
    public void fajlbaIr() throws IOException{
        try (FileWriter file = new FileWriter("tablak"+db+".txt")) {
            for (int ix = 0; ix < db; ix++) {
                file.write(tabla[ix].getTabla());
                file.write("\r\n");
            }
            file.close();
        }
    }
}
