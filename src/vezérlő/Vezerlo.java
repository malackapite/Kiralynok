package vezérlő;

import java.io.IOException;
import modell.Fajl;
import nézet.Tabla;
import nézet.GUI;

public class Vezerlo {
    private Tabla modell;
    private GUI nezet;

    public Vezerlo(Tabla modell, GUI nezet) throws IOException {
        this.modell = modell;
        this.nezet = nezet;
    
        nezet.megjelenit(modell.getTabla());
        modell.Elhelyez(8);
        nezet.megjelenit(modell.getTabla());
        nezet.setSor("Sor: "+modell.getUresSorokSzama()+ "db");
        nezet.setOszlop("Oszlop: "+modell.getUresOszlopokSzama()+ "db");
        
        Fajl fajl = new Fajl('*', 64);
        fajl.fajlbaIr();
    }
}
